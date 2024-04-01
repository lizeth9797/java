package org.generation.firstProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //dice que es una App Springboot modelo MVC, y cuando se levanta  va a escanear todos los paquetes dentro de nuestro paquete principal y los va a registrar para saber que los puede utilizar 
@RestController //define que es un controlador
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	
	@GetMapping("/hola/") //asigna una solicitud http GET al servidor
	public String holaMundo() {
		return "Hola mundo";
	}
}
