package org.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.generation.ecommerce.model.Product;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	private final String token="Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbXlAZ21haWwuY29tIiwicm9sZSI6InVzZXIiLCJpYXQiOjE3MTE5OTk3MzUsImV4cCI6MTcxMjAzNTczNX0.DiDafBbSuQgC4LhKVgBo-ewx3xpAYwnGwRukCpqxD-I";

	@Test
	@DisplayName("Se prueba el endpoint http://localhost:8080/api/products/1")
	void pruebaGet() throws Exception{ //get a productos sin token
		this.mockMvc.perform(get("/api/products/1"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(
					content().string(containsString("73828.gif"))
					);
	}//pruebaGet
	
	@Test
	@Disabled("Probado la primera vez y después deshabilitado para evitar error")
	@DisplayName("Se prueba borrar el producto con id 3 http://localhost:8080/api/products/3")
	void pruebaDELETE() throws Exception{ 
		this.mockMvc.perform(delete("/api/products/3").header("Authorization", token)) //dentro de la solicitud delete debemos colocar el token
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(
					content().string(containsString("Cuaderno Profesional Norma Raya 200 hojas"))
					);
	}//pruebaDelete
	
	@Test
	@DisplayName("Se prueba agregar un producto http://localhost:8080/api/products/3")
	void pruebaPOST() throws Exception{ 
		Product p = new Product();
		p.setName("Pluma y Lapicero Zebra Z-Grip Silve");
		p.setDescription("Pluma y Lapicero Zebra Z-Grip Silver Azul");
		p.setURL_image("100161506.jpeg");
		p.setPrice(79);
		this.mockMvc.perform(post("/api/products/")
			.contentType(MediaType.APPLICATION_JSON)	
			.content(asJsonString(p))
			.header("Authorization", token))
		    .andDo(print())
			.andExpect(status().isOk())
			.andExpect(
					content().string(containsString("Pluma y Lapicero Zebra Z-Grip Silver Azul"))
					);
	}//pruebaPost
	
	
	@Test
	@DisplayName("Se prueba actualizar un producto http://localhost:8080/api/products/3")
	void pruebaPUT() throws Exception{ 
		Product p = new Product();
		p.setName("");
		p.setDescription("");
		p.setURL_image("");
		p.setPrice(150.99);
		this.mockMvc.perform(put("/api/products/4")
			.contentType(MediaType.APPLICATION_JSON)	
			.content(asJsonString(p))
			.header("Authorization", token))
		    .andDo(print())
			.andExpect(status().isOk())
			.andExpect(
					content().string(containsString("150.99"))
					);
	}//pruebaPut
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString
}
