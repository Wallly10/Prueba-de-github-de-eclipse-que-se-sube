package ar.unlam.edu.pb2.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Circulo;
import ar.edu.unlam.pb2.dominio.Cuadrado;
import ar.edu.unlam.pb2.dominio.Figura;
import ar.edu.unlam.pb2.dominio.Punto;
import ar.edu.unlam.pb2.dominio.Rectangulo;

public class OrdenamientoDeFigurasTest {

	@Test
	public void testOrdenamiento() {
        Figura[] figuras = {
            new Cuadrado(new Punto(0, 0), 2),
            new Circulo(new Punto(0, 0), 1.0),
            new Rectangulo(new Punto(0, 0), new Punto(1, 4))
        };

        Arrays.sort(figuras);

        assertTrue(figuras[0].area() <= figuras[1].area());
        assertTrue(figuras[1].area() <= figuras[2].area());
    }
}
