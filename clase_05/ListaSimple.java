package clase_05;

public class ListaSimple {

    public Nodo top;

    public ListaSimple (){
        this.top = null;
    }
    public boolean esVacia(){
        return (getTop() == null)? true:false;

    }

    public Nodo getTop() {
        return top;
    }

    public void setTop(Nodo top) {
        this.top = top;
    }
    public void  addInicio(Estudiante x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if(getTop() == null){
            setTop(nuevo);

        }
        else{
            nuevo.setSiguiente(top);
            setTop(nuevo);
        }

    }
    public void addFinal(Estudiante x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if(esVacia()){
            setTop(nuevo);
        }else{
            Nodo p = getTop();
            while(p.getSiguiente()!= null){
                p = p.getSiguiente();
            }
            p.setSiguiente(nuevo);
        }
    }

    public Nodo delInicio(){
        if(esVacia()){
            System.out.println("lista vacia ");
            return null;
        }
        else{
            Nodo p = getTop();
            top = top.getSiguiente();
            p.setSiguiente(null);
            return p;
        }
    }
    public Nodo delFinal(){
        if(esVacia()){
            System.out.println("lista vacia ");
            return null;
        }else{

            Nodo p = getTop();
            if(p.getSiguiente() == null){
                p = top;
                top = null;
                return  p;
            }else {
                Nodo q = getTop();
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
        Nodo p = new Nodo();
        p = getTop();
        boolean sw = false;
        if(esVacia()){
            System.out.println("  No hay elementos");
        }
        while(p != null){
            if(p.getDato().carnet== carnet){
                p.getDato().mostrarEstudiante();
                sw = true;
            }
            p = p.getSiguiente();

        }
        if(!sw){
            System.out.println("no hay ese carnet");
        }
    }
    public void mostrarlista(){
        Nodo p = getTop();
        while(p != null){
            p.getDato().mostrarEstudiante();
            p = p.getSiguiente();
        }
    }
}
