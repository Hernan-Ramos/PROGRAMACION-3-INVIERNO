package clase_2;

public class PilaJugadores {
    public static void main(String[] args) {
        Pila p = new Pila(4);
        Jugador j1 = new Jugador("Diego", "12345", "Masculino", 19, "Delantero");
        Jugador j2 = new Jugador("jhoana","14683678", "Femenino", 19, "Centro");
        Jugador j3 = new Jugador("Cris","190467", "Masculino", 18, "Defensa");
        Jugador j4 = new Jugador("Gus","18934789", "Masculino", 17, "Centro");
        p.adicionar(j1);
        p.adicionar(j2);
        p.adicionar(j3);
        p.adicionar(j4);

        p.Mostrar();
        System.out.println("----------------------------");
        PilaJugadores pj = new PilaJugadores();
        pj.EliminarporEdad(p);
        System.out.println("---------------------------");
        pj.crearPilaMasculino(p);
    }
    public void EliminarporEdad(Pila p){
        Jugador x;
        Pila paux = new Pila(p.max);
        boolean sw = false;
        while(!p.esVacia()){
            x = p.eliminar();

            if(x.getEdad()<18){
                sw = true;

            }else{
                paux.adicionar(x);
            }
        }
        p.Vaciar(paux);
        if(!sw){
            System.out.println("No hay ningun Jugador menor de 18");
        }else{
            System.out.println("se elimino al siguiente jugador menor de 18 " );
        }
        System.out.println("Pila actualizada:");
        p.Mostrar();
    }

    public void crearPilaMasculino(Pila p){
        Pila mas = new Pila(p.max);
        Pila paux = new Pila(p.max);
        while(!p.esVacia()){
            Jugador x = p.eliminar();
            if(x.getSexo().equals("Masculino")){
                mas.adicionar(x);
            }else{
                paux.adicionar(x);

            }

        }
        p.Vaciar(paux);
        System.out.println("pila masculino");
        mas.Mostrar();
        System.out.println("pila femenino");
        p.Mostrar();
    }
}
