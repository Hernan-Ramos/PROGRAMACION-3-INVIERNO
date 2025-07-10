package clase_06;

public class Nodo {
    public int dato;
    public Nodo siguiente;

    public Nodo(){
        this.siguiente = null;

    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
