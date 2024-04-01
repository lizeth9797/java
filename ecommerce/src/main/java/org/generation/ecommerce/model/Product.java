package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO: Plain Old Java Object
@Entity
@Table(name="productos") //nombre de la tabla en nuestra BD
public class Product {
	@Id //es la llave
	@GeneratedValue(strategy=GenerationType.IDENTITY) //tiene el objetivo para indicarle el valor que va a tomar el id, que será automático-incremental(mendiante el IDENTITY)
	@Column(name="id",unique=true,nullable=false)//si queremos que una columna tenga un nombre distinto (por ej el de id)
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String description;
	private String URL_image;
	private double price;
	//eliminamos el contador porque ya lo haremos con la BD
	//private static int total=0; //inicializa el contador de los productos
	
	public Product(String name, String description, String uRL_image, double price) {
		super();
		this.name = name;
		this.description = description;
		URL_image = uRL_image;
		this.price = price;
		//Product.total++;
		//id=Product.total;
	}
	public Product() {
		//Product.total++;
		//id=Product.total;	
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getURL_image() {
		return URL_image;
	}
	public void setURL_image(String uRL_image) {
		URL_image = uRL_image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", URL_image=" + URL_image + ", price="
				+ price + ", id=" + id + "]";
	}
	

	
	//1. Constructor using fields
	//1.1 Constructor empty //POST
	//2. Getters and Setters
	//3. toString
	
}
