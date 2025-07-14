package clase_09;

public class nodoproyecto {
    private proyecto dato;
    private nodoproyecto siguiente;
    private nodoproyecto anterior;

    public nodoproyecto() {
        this.siguiente = null;
        this.anterior = null;
    }

    public proyecto getDato() {
        return dato;
    }

    public void setDato(proyecto dato) {
        this.dato = dato;
    }

    public nodoproyecto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoproyecto siguiente) {
        this.siguiente = siguiente;
    }

	public nodoproyecto getAnterior() {
		return anterior;
	}

	public void setAnterior(nodoproyecto anterior) {
		this.anterior = anterior;
	}
	
    
}