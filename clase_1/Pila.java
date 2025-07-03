package clase_1;

public class Pila {
    private int [] arreglo;
    private int tope;
    private int max;

    public Pila(int max){
        this.max = max;
        this.arreglo = new int[max];
        this.tope = -1;

    }

    public void adicionar(int x){
        if(!this.esLlena()) {
            this.tope++;
            this.arreglo[this.tope] = x;
        } else{
            System.out.println("clase_1.Pila llena no se puede adicionar otro elelmento");
        }
    }

    public int eliminar(){
        if(this.esVacia()){
            System.out.println("pila vacia");
            return -1;
        }else{
            int valor;
            valor = this.arreglo[this.tope];
            this.tope --;
            return valor;
        }
    }
    public boolean esVacia(){
        if(this.tope  == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esLlena(){
        return this.tope == this.max - 1;
    }

    public void mostrar(){
        int valor;
        Pila aux = new Pila(this.max);
        while (!this.esVacia()) {
            valor = this.eliminar();
            System.out.println(valor);
            aux.adicionar(valor);
        }
        while (!aux.esVacia()) {
            this.adicionar(aux.eliminar());
        }

    }

    public static void main(String[] args){
        Pila p = new Pila(5);
        p.adicionar(11);
        p.adicionar(22);
        p.adicionar(33);
        p.adicionar(44);

        System.out.println(p.eliminar());
        p.mostrar();

    }
}
