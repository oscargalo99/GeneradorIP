package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIPTest {

	GeneradorIP generador;

	@BeforeEach
	void setUp() throws Exception {
		generador = new GeneradorIP();
	}

	@Test
	void testGenerarIp() {
		String ip = generador.generarIp();
		String[] numeros = ip.split("\\.");
		assertFalse(numeros[0].equals("0") & numeros[3].equals("0"));
	}
	
	@Test
	void testGenerarNumero() {
		int ip = generador.generarNumero(0, 254);
		assertTrue(ip > 0 && ip <= 254);
	}
	
	

}
