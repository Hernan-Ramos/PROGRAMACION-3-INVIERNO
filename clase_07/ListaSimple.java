package clase_07;

public class ListaSimple {

    public NodoS top;

    public ListaSimple (){
        this.top = null;
    }

    public boolean esVacia(){
        return (getTop() == null);
    }

    public NodoS getTop() {
        return top;
    }

    public void setTop(NodoS top) {
        this.top = top;
    }
    
    public void addInicio(Estudiante x){
        NodoS nuevo = new NodoS();
        nuevo.setDato(x);
        if(getTop() == null){
            setTop(nuevo);
        } else {
            nuevo.setSiguiente(top);
            setTop(nuevo);
        }
    }

    public void addFinal(Estudiante x){
        NodoS nuevo = new NodoS();
        nuevo.setDato(x);
        if(esVacia()){
            setTop(nuevo);
        } else {
            NodoS p = getTop();
            while(p.getSiguiente() != null){
                p = p.getSiguiente();
            }
            p.setSiguiente(nuevo);
        }
    }

    public NodoS delInicio(){
        if(esVacia()){
            System.out.println("lista vacia ");
            return null;
        } else {
            NodoS p = getTop();
            top = top.getSiguiente();
            p.setSiguiente(null);
            return p;
        }
    }

    public NodoS delFinal(){
        if(esVacia()){
            System.out.println("lista vacia ");
            return null;
        } else {
            NodoS p = getTop();
            if(p.getSiguiente() == null){
                top = null;
                return p;
            } else {
                NodoS q = getTop();
                while(p.getSiguiente() != null){
                    q = p;
                    p = p.getSiguiente();
                }
                q.setSiguiente(null);
                return p;
            }
        }
    }

    public void mostrarporCarnet(int carnet){
        NodoS p = getTop();
        boolean sw = false;
        if(esVacia()){
            System.out.println("No hay elementos");
            return;
        }
        while(p != null){
            if(p.getDato().carnet == carnet){
                p.getDato().mostrarEstudiante();
                sw = true;
            }
            p = p.getSiguiente();
        }
        if(!sw){
            System.out.println("No hay ese carnet");
        }
    }

    public void mostrarlista(){
        NodoS p = getTop();
        while(p != null){
            p.getDato().mostrarEstudiante();
            p = p.getSiguiente();
        }
    }
}
