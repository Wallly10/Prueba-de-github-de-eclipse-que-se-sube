package ar.edu.unlam.pb2.dominio;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Punto esquinaInferiorIzquierda, int lado) {
		super(esquinaInferiorIzquierda,
				new Punto(esquinaInferiorIzquierda.getX() + lado, esquinaInferiorIzquierda.getY() + lado));
	}

	//asdasdasdasdasd
}
