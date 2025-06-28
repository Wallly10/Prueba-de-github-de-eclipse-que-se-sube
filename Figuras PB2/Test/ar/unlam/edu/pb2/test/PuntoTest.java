package ar.unlam.edu.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Punto;

public class PuntoTest {

	@Test
	public void testMover() {
		Punto punto = new Punto(1, 1);
		punto.mover(2, 3);
		assertEquals(3, punto.getX(), 0.1);
		assertEquals(4, punto.getY(), 0.1);
	}

}
