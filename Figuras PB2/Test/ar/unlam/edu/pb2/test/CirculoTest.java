package ar.unlam.edu.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Circulo;
import ar.edu.unlam.pb2.dominio.Punto;

public class CirculoTest {

	@Test
	public void testAreaCirculo() {
        Circulo ciruclo = new Circulo(new Punto(0, 0), 2.0);
        assertEquals(Math.PI * 4, ciruclo.area(), 0.01);
    }
}
