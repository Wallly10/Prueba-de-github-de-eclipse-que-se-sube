package ar.unlam.edu.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Elipse;
import ar.edu.unlam.pb2.dominio.Punto;

public class ElipseTest {

	@Test
	public void testAreaElipse() {
        Elipse elipse = new Elipse(new Punto(0, 0), 2.0, 3.0);
        assertEquals(Math.PI * 2 * 3, elipse.area(), 0.01);
    }

}
