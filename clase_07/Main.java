package clase_07;

public class Main {
    public static void main(String[] args) {
        
        ListaCircular lista = new ListaCircular(null);

        profesor prof1 = new profesor("Juan Pérez", 1234, "Matemáticas");
        profesor prof2 = new profesor("Ana Gómez", 5678, "Física");
        profesor prof3 = new profesor("Luis Martínez", 9101, "Química");

        lista.addPrimero(prof1);
        lista.addPrimero(prof2);
        lista.addPrimero(prof3);

        
        System.out.println("Lista de profesores:");
        lista.mostarListaCircular();
        System.out.println("  ");
        System.out.println("-------------------------------------");
        //System.out.println("Buscando profesor con carnet:");
        //lista.mbuscarporCarnet(1234);
        //lista.eliPrimero();
        System.out.println("-----------------");
        //lista.mostarListaCircular();
        lista.eliNodoCarnet(5678);
        
        lista.mostarListaCircular();
        
        
        
    }
}
