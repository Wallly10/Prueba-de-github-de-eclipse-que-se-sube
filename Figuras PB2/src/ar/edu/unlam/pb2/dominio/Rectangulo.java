package ar.edu.unlam.pb2.dominio;

public class Rectangulo extends Figura{

	protected Punto esquinaInferiorIzquierda;
	protected Punto esquinaSuperiorDerecha;
	
	public Rectangulo(Punto inf , Punto sup) {
		this.esquinaInferiorIzquierda = inf;
		this.esquinaSuperiorDerecha = sup;
		
	}
	
	@Override
	public void mover(Integer deltaX, Integer deltaY) {
		// TODO Auto-generated method stub
		esquinaInferiorIzquierda.mover(deltaX, deltaY);
		esquinaSuperiorDerecha.mover(deltaX, deltaY);
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		Integer base = esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX();
		Integer altura = esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY();
		return (double) (base * altura);
	}

}
