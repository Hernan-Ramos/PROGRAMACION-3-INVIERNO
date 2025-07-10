package clase_07;

public class NodoS {

	
	    public Estudiante dato;
	    public NodoS siguiente;

	    public NodoS() {
	        siguiente = null;
	    }

	    public Estudiante getDato() {
	        return dato;
	    }

	    public void setDato(Estudiante dato) {
	        this.dato = dato;
	    }

	    public NodoS getSiguiente() {
	        return siguiente;
	    }

	    public void setSiguiente(NodoS siguiente) {
	        this.siguiente = siguiente;
	    }
}


