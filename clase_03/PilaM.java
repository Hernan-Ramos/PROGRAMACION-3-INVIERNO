package clase_03;

public class PilaM {
    public Mascota[] m;
    public int tope;
    public int max;

    public PilaM(int max) {
        this.max = max;
        this.m = new Mascota[this.max];
        this.tope =-1;
    }

    public  boolean esVacia(){
        return this.tope == -1;
    }
    public boolean esLlena() {
        return this.max-1 == this.tope;
    }
    public void adicionar(Mascota x){
        if(esLlena()){
            System.out.println("Pila llena, no se puede adicionar otro elemento ");
        }
        else{
            this.tope++;
            this.m[this.tope]= x;

        }

    }
    public Mascota eliminar(){
        Mascota x;
        if(esVacia()){
            System.out.println("Pila vacia, mno hay elementos que eliminar");
            return null;
        }else{
            x =this.m[this.tope];
            this.tope--;
            return x;
        }
    }
    public void Mostrar(){
        Mascota x;
        PilaM paux = new PilaM(this.max);
        while(!esVacia()){
            x = eliminar();
            paux.adicionar(x);
            x.mostrarMascota();
        }
        Vaciar(paux);
    }
    public void Vaciar(PilaM p){
        Mascota m;
        while(!p.esVacia()){
            m = p.eliminar();
            adicionar(m);
        }
    }
}
