package ar.edu.unlam.pb2.dominio;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        figuras[0] = new Circulo(new Punto(0, 0), 2.0);
        figuras[1] = new Rectangulo(new Punto(0, 0), new Punto(3, 2));
        figuras[2] = new Cuadrado(new Punto(1, 1), 3);
        figuras[3] = new Elipse(new Punto(2, 2), 2.0, 1.0);
        figuras[4] = new Cuadrado(new Punto(3, 3), 1);

        Arrays.sort(figuras);

        for (Figura f : figuras) {
            System.out.println(f.getClass().getSimpleName() + " con área: " + f.area());
        }
    }
}
