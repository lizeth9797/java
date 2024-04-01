package org.generation.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.model.Product;
import org.generation.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	/*public final ArrayList<Product> list = new ArrayList(); //ya no usaremos esta lista porque ahora nos conectaremos a la BD
	public ProductService() {
		list.add( new Product("Cuaderno Profesional Norma Raya 100 hojas", "Cuaderno profesional / Cubiertas estándar / Espiral doble 100 hojas", "https://www.officedepot.com.mx/medias/100147261.jpg-515ftw?context=bWFzdGVyfHJvb3R8MTMxNTQ4fGltYWdlL2pwZWd8YUdaa0wyZ3pNUzh4TVRrME9UVXhNRFU1TURRNU5DOHhNREF4TkRjeU5qRXVhbkJuWHpVeE5XWjBkd3xhZmYyYTQxNzk0OTRmZjJmNDE0ZDMyZDYzNjc1ZDgyMzIxM2QyMjA5MmVlZTcxOGVjN2RiM2QzZjI4NzE3Mjlm", 49.90) );

		list.add( new Product("Cuaderno Profesional Norma Cuadro Chico 100 hojas", " Cuadro chico (C5)  Surtido (puede variar dependiendo de la disponibilidad en tienda)", "https://www.officedepot.com.mx/medias/100147261-3.jpg-515ftw?context=bWFzdGVyfHJvb3R8OTY0OTV8aW1hZ2UvanBlZ3xhREEwTDJnNU1TOHhNVGswT1RVeE1USTBOVGcxTkM4eE1EQXhORGN5TmpFdE15NXFjR2RmTlRFMVpuUjN8ZWFkZjU0Nzg3ZDg2Mzg5ODEwNTg5ZDViODczMDQ3ZTliMGJkMWYzOTQ4ZmFkMDIwYWQwNTM4M2ZiMGQ3M2RjNA",49.00 ) );

		list.add( new Product("Plumas Bic Cristal Dura Más", "Plumas Bic Cristal Dura Más / Punto mediano / Tinta negra / 12 piezas", "https://www.officedepot.com.mx/medias/515ftw-1.jpg?context=bWFzdGVyfHJvb3R8OTQ3Mzd8aW1hZ2UvanBlZ3xhRGt3TDJneE5DOHhNakl4TURFeU56Z3pNVEEzTUM4MU1UVm1kSGRmTVM1cWNHY3w0MTM5YmU5NThiZjY2OWM5ZmVjNzRjZDI2MWE5ZTQ1OWYyNGM1MTRlNTlhMTA5ZDhlZmVmZjMxOGJkMGU3NmE4", 49.90) );
	}*/

	public final ProductRepository productRepository; //productRepository es un objeto de la clase ProductRepository
	@Autowired //para que se autoconecte, autollene, autoenlazar. Le va a decir al servidor q cuando cree un servicio, le pase un repository
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}//constructor
	
	/*public ArrayList<Product> getAllProducts() {
		return list;
	}*/
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}//getAllProducts


	public Product getProduct(Long prodId) {
		  return productRepository.findById(prodId).orElseThrow(
		  ()-> new IllegalArgumentException("El producto con el id ["+prodId+"] no existe"));
		/*Product tmpProd=null;
		for (Product product : list) {
			if(product.getId()==prodId) {
				tmpProd= product;
				break;
			}
		}//endFor each
		return tmpProd;*/
	}

	public Product addProduct(Product product) {
		//Para evitar duplicados:
		 Optional<Product> tmpProd=productRepository.findByName(product.getName());
		 if(tmpProd.isEmpty()){
		 	return productRepository.save(product);
		 }else{
		 		System.out.println("Ya existe el producto con el nombre ["+product.getName()+"]");//importante: no podemos acceder a las propiedades como "product.name" porque son privadas, tenemos que acceder a ellas a traves de sus metodos del modelo
		 		return null;
		 }
		/*Product tmpProd=null;
		if(list.add(product)) { //el add me regresa un booleano diciendo si se agregó o no
			tmpProd=product;
		}
		return tmpProd;*/
		
		 
		 /*Product tmpProd=null;
		 tmpProd=productRepository.save(product);
		 return tmpProd;*/		 
	}

	public Product deleteProduct(Long prodId) {
		/*Product tmpProd=null;
		for (Product product : list) {
			if(product.getId()==prodId) {
				tmpProd=product;
				list.remove(product); //borra el producto en la lista
				break;
			}
		}//endFor each
		return tmpProd;*/
		
		Product tmpProd=null;
		if(productRepository.existsById(prodId)) { 
			tmpProd=productRepository.findById(prodId).get();
			productRepository.deleteById(prodId);
		}//if
		return tmpProd;		
	}//deleteProduct

	/*public Product updateProduct(int prodId, String name, String description, String uRL_image, Double price) {
		Product tmpProd=null;
		for (Product product : list) {
			if(product.getId()==prodId) {
				tmpProd=product;
				if(name!=null) product.setName(name);
				if(description!=null) product.setDescription(description);
				if(uRL_image!=null) product.setURL_image(uRL_image);
				if(price!=null) product.setPrice(price);
				tmpProd=product;
				break;
			}
		}//endFor each
		return tmpProd;
	}*/
	
	/*public Product updateProduct(Long prodId, String name, String description, String uRL_image, Double price) {
		Product tmpProd=null;
		for (Product product : list) {
			if(product.getId()==prodId) {
				tmpProd=product;
				if(name.length()!=0) product.setName(name);
				if(description.length()!=0) product.setDescription(description);
				if(uRL_image.length()!=0) product.setURL_image(uRL_image);
				if(price.doubleValue()>0) product.setPrice(price);
				tmpProd=product;
				break;
			}
		}//endFor each
		return tmpProd;
	}*/
	
	public Product updateProduct(Long prodId, String name, String description, String uRL_image, Double price) {
		Product product=null;
			if(productRepository.existsById(prodId)) {
				product=productRepository.findById(prodId).get();
				if(name.length()!=0) product.setName(name);
				if(description.length()!=0) product.setDescription(description);
				if(uRL_image.length()!=0) product.setURL_image(uRL_image);
				if(price.doubleValue()>0) product.setPrice(price);
				productRepository.save(product);
			}//exitIf
		return product;
	}//updateProduct
	
	
}
