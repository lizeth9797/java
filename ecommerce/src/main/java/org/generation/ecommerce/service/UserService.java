package org.generation.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.dto.ChangePassword;
import org.generation.ecommerce.model.Product;
import org.generation.ecommerce.model.User;
import org.generation.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public final UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();

	}

	public User getUser(Long id) {
	  return userRepository.findById(id).orElseThrow(
	  ()-> new IllegalArgumentException("El usuario con el id ["+id+"] no existe"));

	}

	public User deleteUser(Long id) {
		User user=null;
		if(userRepository.existsById(id)) { 
			user=userRepository.findById(id).get();
			userRepository.deleteById(id);
		}//if
		return user;	
	}

	public User addUser(User user) {
		User tmpUser=null;
		if(userRepository.findByEmail(user.getEmail()).isEmpty()){
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			tmpUser = userRepository.save(user);
		 }else{
		 		System.out.println("El usuario con el email ["+user.getEmail()+"]");
		 }
		return tmpUser;	
	}//addUser
	
	public User updateUser(Long id, ChangePassword changePassword) {
		User tmpUser=null;
		if(userRepository.existsById(id)) { 
			tmpUser=userRepository.findById(id).get(); //primero buscamos al usuario
			if(passwordEncoder.matches(changePassword.getPassword(),tmpUser.getPassword())) {
			//if(tmpUser.getPassword().equals(changePassword.getPassword())) {//ahora verificamos que la contraseña que nos está dando corresponde a la vieja	
				//tmpUser.setPassword(changePassword.getNpassword());
				tmpUser.setPassword(passwordEncoder.encode(changePassword.getNpassword()));
				userRepository.save(tmpUser);
			}else {
				System.out.println("updateUser-El password del usuario ["+
			tmpUser.getId()+"] no coincide");
				tmpUser=null;
			}
		}//if existsById
		return tmpUser;
	}

	public boolean validateUser(User user) {
		Optional<User> userByEmail=userRepository.findByEmail(user.getEmail());
		if(userByEmail.isPresent()) {
			User tmpUser=userByEmail.get();
			//if(user.getPassword().equals(tmpUser.getPassword())) {
			if(passwordEncoder.matches(user.getPassword(), tmpUser.getPassword())) {
				return true;
			}//if equals
		}//if isPresent
		return false;
	}//validateUser
}
