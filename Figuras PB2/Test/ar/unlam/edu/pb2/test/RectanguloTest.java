package ar.unlam.edu.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Punto;
import ar.edu.unlam.pb2.dominio.Rectangulo;

public class RectanguloTest {

	@Test
	 public void testArea() {
        Rectangulo rectangulo = new Rectangulo(new Punto(0, 0), new Punto(3, 2));
        assertEquals(6.0, rectangulo.area(), 0.01);
    }

}
