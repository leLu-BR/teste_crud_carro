package br.com.carro_crud.carro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarroTests {

	Carro c = new Carro("marca", "modelo", 1983, "XYZ1234");
	

	@Test
	void contextLoads() {
	}

	@Test
	void carroGetMarca() {
		assertEquals("marca", c.getMarca());
	}

	@Test 
	void carroGetmodelo() {
		assertEquals("modelo", c.getModelo());
	}
	
	@Test
	void carroGetAno(){
		assertEquals(1983, c.getAno());
	}
	
	@Test
	void carroGetPlaca(){
		assertEquals("XYZ1234", c.getPlaca());
	}

	
	@Test
	void carroSetMarca() {
		c.setMarca("marcaPeixe");
		assertEquals("marcaPeixe", c.getMarca());
		
	}

	@Test
	void carroSetModelo() {
		c.setMarca("modelo#2");
		assertEquals("modelo", c.getModelo());
		
	}

	@Test
	void carroSetAno() {
		c.setAno(1994);
		assertEquals(1994, c.getAno());
		
	}

	@Test
	void carroSetPlaca() {
		c.setPlaca("Gas$Velo");
		assertEquals("Gas$Velo", c.getPlaca());
	}
}
