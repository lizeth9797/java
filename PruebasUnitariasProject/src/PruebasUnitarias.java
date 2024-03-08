import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasUnitarias {
	Calculadora calc=new Calculadora();
	
	@Test
	@DisplayName("Prueba para capturar una Excepción ArithmeticException")
	void pruebaException() {
		assertEquals(3,calc.divide(9, 3));
		assertEquals(5,calc.divide(25, 5));
		
		Exception e=assertThrows(ArithmeticException.class,
				()->calc.divide(10, 0));
		assertEquals("/ by zero",e.getMessage());
		
	}
	
	@Test 
	@DisplayName("Prueba si el valor de getStrPI no es nulo")
	void pruebaString() {
		assertNotNull(calc.getStrPI());
	}
	
	@Test 
	@DisplayName("Prueba el valor de PI dentro de un rango")
	void pruebaBooleana() {
		assertTrue(calc.getPI()>=3.14);
		assertTrue(calc.getPI()<=3.1416);
	}
	
	@Test //esta anotación nos permite indicar que debe ejecutar la prueba
	@DisplayName("Prueba la suma de 2 enteros")
	void pruebaSumaEnteros() {
		assertEquals(4,calc.suma(2, 2));
		assertEquals(6,calc.suma(3, 3));
		assertEquals(18,calc.suma(9, 9));

		//fail("Not yet implemented");
	}//pruebaSumaEnteros

}
