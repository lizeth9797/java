package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{ //lo que está dentro de '<T,ID>' se le llama tipo de dato generic, la 'T' tiene que ver con el tipo, en este caso Tabla Products
//el repositorio va a heredar de JpaRepository, este ya tiene las instrucciones para conectarnos a la BD, actualizar, borrar, etc.  	
	
	
	//Optional nos regresa una bolsa(traiga o no el producto) como cuando vas al super y no encuentras o si algo, regresas con la bolsa, sin importar qué hay dentro
	Optional<Product>findByName(String name); //hay que nombrarlo igual al nombre de la variable (en este caso es name)
	//findByName usa el parámetro que le pasemos para buscar si existe ese nombre 
	
}//interface ProductRepository
