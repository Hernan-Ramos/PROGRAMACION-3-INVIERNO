package clase_09;

public class nodoc {
	public Profesor dato;
	public nodoc siguiente;
	public nodoc() {
		super();
		
		this.siguiente = null;
	}
	public Profesor getDato() {
		return dato;
	}
	public void setDato(Profesor dato) {
		this.dato = dato;
	}
	public nodoc getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(nodoc siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
