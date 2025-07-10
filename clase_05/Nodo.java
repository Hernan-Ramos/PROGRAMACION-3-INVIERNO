package clase_05;

public class Nodo {
    public Estudiante dato;
    public Nodo siguiente;

    public Nodo() {
        siguiente = null;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
