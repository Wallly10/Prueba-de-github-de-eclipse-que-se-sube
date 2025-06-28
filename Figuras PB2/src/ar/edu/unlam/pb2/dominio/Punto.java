package ar.edu.unlam.pb2.dominio;

public class Punto implements iMovible{

	private Integer x;
	private Integer y;
	
	public Punto(Integer x, Integer y ) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public void mover(Integer deltaX, Integer deltaY) {
		// TODO Auto-generated method stub
		this.x += deltaX;
		this.y += deltaY;
	}
	
	
	
}
