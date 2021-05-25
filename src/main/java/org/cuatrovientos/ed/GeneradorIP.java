package org.cuatrovientos.ed;

import java.util.Random;

public class GeneradorIP {

	public int generarNumero(int min, int max) {
		int numeroDevolver = 0;
		Random rnd = new Random();
		numeroDevolver = rnd.nextInt(max);
		return numeroDevolver;
	}

	public String generarIp() {
		return generarNumero(1, 255) + "." + generarNumero(0, 255) + "." + generarNumero(0, 255) + "."
				+ generarNumero(1, 255);
	}

}
