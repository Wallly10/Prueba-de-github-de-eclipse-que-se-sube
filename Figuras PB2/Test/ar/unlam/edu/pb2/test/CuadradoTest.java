package ar.unlam.edu.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Cuadrado;
import ar.edu.unlam.pb2.dominio.Punto;

public class CuadradoTest {

	@Test
	 public void testArea() {
        Cuadrado cuadrado = new Cuadrado(new Punto(0, 0), 4);
        assertEquals(16.0, cuadrado.area(), 0.01);
    }

}
