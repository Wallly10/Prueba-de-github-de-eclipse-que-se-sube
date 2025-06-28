package ar.edu.unlam.pb2.dominio;

public class Elipse extends Figura{

	protected Punto centro;
	protected Double radioMenor;
	protected Double radioMayor;
	
	

	public Elipse(Punto centro, Double radioMenor, Double radioMayor) {
		super();
		this.centro = centro;
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	@Override
	public void mover(Integer deltaX, Integer deltaY) {
		// TODO Auto-generated method stub
		centro.mover(deltaX, deltaY);
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * radioMayor * radioMenor;
	}

}
