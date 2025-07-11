package clase_08;
public class Main {
    public static void main(String[] args) {
        
        Listac lista1 = new Listac(null);
        lista1.addPrimero(new Profesor("Juan Perez", 1234, "Matemáticas"));
        lista1.addPrimero(new Profesor("Ana Gómez", 5678, "Física"));

       
        Listac lista2 = new Listac(null);
        lista2.addPrimero(new Profesor("Carlos Ruiz", 9876, "Programación"));
        lista2.addPrimero(new Profesor("Elena López", 4321, "Sistemas"));

       
        Listac lista3 = new Listac(null);
        lista3.addPrimero(new Profesor("Juan Perez", 2468, "Química"));
        lista3.addPrimero(new Profesor("Lucía Torres", 1357, "Biología"));

        
        Listas estudiantes1 = new Listas();
        estudiantes1.addFinal(new Estudiante(1, "Ana", "Pérez", "Morales", 20));
        estudiantes1.addFinal(new Estudiante(2, "Luis", "Chávez", "González", 22));

       
        Listas estudiantes2 = new Listas();
        estudiantes2.addFinal(new Estudiante(3, "Diego", "Hernán", "Ramos", 23));
        estudiantes2.addFinal(new Estudiante(4, "Marta", "Calderón", "Flores", 21));

        
        Listas estudiantes3 = new Listas();
        estudiantes3.addFinal(new Estudiante(5, "Carlos", "Ríos", "Zamora", 24));
        estudiantes3.addFinal(new Estudiante(6, "Valeria", "Mendoza", "Loayza", 19));

        
        proyecto p1 = new proyecto(
            "Proyecto Académico Matemático",
            "Educación",
            "1 de julio",
            "10 de julio",
            30000,
            estudiantes1,
            lista1
        );

        proyecto p2 = new proyecto(
            "Aplicación Móvil Escolar",
            "Tecnología",
            "15 de junio",
            "10 de julio",
            45000,
            estudiantes2,
            lista2
        );

        proyecto p3 = new proyecto(
            "Laboratorio Científico",
            "Ciencias Naturales",
            "10 de agosto",
            "30 de agosto ",
            55000,
            estudiantes3,
            lista3
        );

        System.out.println("-------------------------------------------------");
        Listasproyect lp = new Listasproyect();
        lp.addFinal(p1);
        lp.addFinal(p2);
        lp.addFinal(p3);
       // lp.mostrarListaProyectos();
        System.out.println("-----------------------------mostrar proyecto con  docente con nombre x-----------------------------");
        System.out.println(" ");
        System.out.println(" ");
        lp.mostrarProyectocondocenteX();
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("----------------------------mostrar proyecto con fecha X de finalizacion----------------------------");
        System.out.println(" ");
        System.out.println(" ");
        lp.mostrarProyectoFinalizadoX("10 de julio");
    }
    
    
}
