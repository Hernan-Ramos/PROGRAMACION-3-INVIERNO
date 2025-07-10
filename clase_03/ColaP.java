package clase_03;

public class ColaP {
    public Propietarios [] p;
    public int max,frente,fin;

    public ColaP(int max) {
        this.max = max;
        this.p = new Propietarios[this.max];
        this.frente = -1;
        this.fin = -1;

    }
    public boolean esVacia(){
        return this.fin == -1 && this.frente==-1;
    }
    public boolean esLlena(){
        if(this.fin == this.max-1){
            return true;
        }
        else{return false;}
    }
    public void adicionar(Propietarios  x){
        if(esLlena()){
            System.out.println("Cola llena");

        }else{
            this.fin++;
            this.p[this.fin]= x;
            if(this.fin == 0){
                this.frente = 0;
            }
        }
    }
    public Propietarios eliminar(){
        Propietarios x;

        if(esVacia()){
            System.out.println("cola Vacia");
            return null;
        }else{
            x = this.p[this.frente];
            if (this.frente == this.fin) {
                // Último elemento eliminado → vaciar cola
                this.frente =this.frente -1;
                this.fin = this.fin-1;
            } else {
                this.frente++;
            }
            return x;

        }

    }
    public void Mostrar(){
        Propietarios x;
        ColaP caux = new ColaP(this.max);
        while(!esVacia()){
            x = eliminar();
            caux.adicionar(x);
            x.mostrarPropietario();
        }
        Vaciar(caux);

    }
    public void Vaciar(ColaP c){

        while(!c.esVacia()){
            Propietarios x = c.eliminar();
            adicionar(x);
        }
    }
}
