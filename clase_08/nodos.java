package clase_08;

public class nodos {
	public Estudiante dato;
	public nodos siguiente;
	public nodos() {
		super();
		
		this.siguiente = null;
	}
	public Estudiante getDato() {
		return dato;
	}
	public void setDato(Estudiante dato) {
		this.dato = dato;
	}
	public nodos getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(nodos siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
