package clase_06;

public class ListaSimple {
    public  Nodo top;

    public ListaSimple() {
        this.top = null;
    }
    public boolean esVacia(){
        return(this.top==null)?true:false;

    }

    public Nodo getTop() {
        return top;
    }

    public void setTop(Nodo top) {
        this.top = top;
    }

    public void addInicio(int x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if(esVacia()){
            this.setTop(nuevo);

        }
        else{
            nuevo.setSiguiente(top);
            setTop(nuevo);
        }

    }
    public void addFinal(int x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if(getTop()==null){
            setTop(nuevo);
        }
        else{
            Nodo p = new Nodo();
            p = getTop();
            while(p.getSiguiente()!=null){
                p = p.getSiguiente();
            }
            p.setSiguiente(nuevo);
        }
    }

    public Nodo delInicio(){
        if(esVacia()){
            System.out.println("Lista vacia no se puede eliminar elementos");
            return null;
        }
        else{
            Nodo p = new Nodo();
            p = getTop();
            top = top.getSiguiente();
            p.setSiguiente(null);
            return p;
        }
    }
    public Nodo delFinal(){
        if (esVacia()){
            System.out.println("Lista vacia no se puede eliminar elementos");
            return null;
        }
        else{
            Nodo p = new Nodo();
            p = getTop();
            if(top.getSiguiente() == null){
                p = top;
                top = null;
                return p;
            }

            else{
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
    public void mostrarLista(){
        Nodo p = getTop();
        while(p != null){
            System.out.println(p.getDato());
            p = p.getSiguiente();
        }
    }



}
