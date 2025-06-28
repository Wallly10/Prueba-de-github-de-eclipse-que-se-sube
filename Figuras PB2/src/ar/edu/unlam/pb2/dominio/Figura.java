package ar.edu.unlam.pb2.dominio;

public abstract class Figura implements iMovible, Comparable<Figura>{

	public abstract Double area();
	
	@Override
	public int compareTo(Figura otra) {
		return Double.compare(this.area(), otra.area());
	}
}
