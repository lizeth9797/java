package org.generation.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.ecommerce.model.Product;
import org.generation.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="https://lizeth9797.github.io/manahuia/",methods={RequestMethod.GET,RequestMethod.POST})//para que acepte solicitudes desde este backend
@RestController
@RequestMapping(path="/api/products/") //http://localhost:8080/api/products/
public class ProductController {

	private final ProductService productService;
	@Autowired //hace que el productService se conecte con el productController
	public ProductController(ProductService productService) {
		this.productService=productService;
	}//constructor
	
	//GET
	@GetMapping
	public List<Product> getProducts() { //para acceder a los datos necesitamos crear una capa de servico (ServiceLayer)
		return productService.getAllProducts();
	}
	
	//GET
	@GetMapping (path="{prodId}") //es una variable que nos van a pasar
	public Product getProduct(@PathVariable("prodId") Long prodId) { //@PathVariable es una variable en la ruta
		return productService.getProduct(prodId);
	}
	
	//POST
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	//PUT
	@PutMapping(path="{prodId}")
	/*public Product updateProduct(@PathVariable("prodId") int prodId,
			@RequestParam (required=false) String name,
			@RequestParam (required=false) String description,
			@RequestParam (required=false) String URL_image,
			@RequestParam (required=false) Double price) {
		
		return productService.updateProduct(prodId,name,description,URL_image,price);	
	}*/
	public Product updateProduct(@PathVariable("prodId") Long prodId,
			@RequestBody Product product) {
		return productService.updateProduct(prodId, product.getName(), product.getDescription(), product.getURL_image(), Double.valueOf(product.getPrice())); //como precio es double, lo convertimos a double de su clase wrapper
	}//updateProduct
			
	
	
	
	//DELETE
	@DeleteMapping(path="{prodId}")
	public Product deleteProduct(@PathVariable("prodId") Long prodId) { //@PathVariable es una variable en la ruta
		return productService.deleteProduct(prodId);
	}
}
