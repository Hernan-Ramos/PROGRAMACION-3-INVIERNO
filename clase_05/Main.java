package clase_05;

public class Main {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante(1,"ana","perez","morales",24);
        Estudiante e2=new Estudiante(2,"juan","perez","",34);
        Estudiante e3=new Estudiante(3,"marta","calderon","",20);
        Estudiante e4=new Estudiante(4,"luis","chavez","",25);
        Estudiante e5=new Estudiante(15125114,"diego","hernan","ramos",20);

        ListaSimple s1 = new ListaSimple();

        s1.addFinal(e1);
        s1.addFinal(e2);
        s1.addFinal(e3);
        s1.addFinal(e4);
        s1.addFinal(e5);
        s1.mostrarlista();
        System.out.println("-----------------------BUSCAR POR CARNET------------------------------------");
        s1.mostrarporCarnet(15125114);



    }
}
