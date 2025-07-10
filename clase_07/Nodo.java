package clase_07;

public class Nodo {
	public Nodo siguiente;
	public profesor dato;
	public Nodo() {
		super();
		this.siguiente = null;
		
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public profesor getDato() {
		return dato;
	}
	public void setDato(profesor dato) {
		this.dato = dato;
	}
	
	
	
}
