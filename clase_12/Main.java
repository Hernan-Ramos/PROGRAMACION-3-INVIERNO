package clase_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       
        Practica practica1 = new Practica("2023-06-10", "Física Cuántica");
        Practica practica2 = new Practica("2023-06-12", "Electromagnetismo");
        Practica practica3 = new Practica("2023-06-14", "Mecánica de Fluidos");

        
        ListaSimPracticas listaPracticas1 = new ListaSimPracticas();
        listaPracticas1.addInicio(practica1);
        listaPracticas1.addFinal(practica2);
        listaPracticas1.addFinal(practica3);

       
        Evaluacion evaluacion1 = new Evaluacion(95, 1);
        Evaluacion evaluacion2 = new Evaluacion(88, 2);
        Evaluacion evaluacion3 = new Evaluacion(92, 3);

        ListaDobleEvaluacion listaEvaluaciones1 = new ListaDobleEvaluacion();
        listaEvaluaciones1.addIni(evaluacion1);
        listaEvaluaciones1.addFin(evaluacion2);
        listaEvaluaciones1.addFin(evaluacion3);

        
        Estudiante estudiante1 = new Estudiante(12345, 20, "Juan", "Pérez", "González", listaPracticas1, listaEvaluaciones1);

       
        Practica practica4 = new Practica("2023-06-11", "Cálculo Diferencial");
        Practica practica5 = new Practica("2023-06-13", "Álgebra Abstracta");
        Practica practica6 = new Practica("2023-06-15", "Geometría Analítica");

        
        ListaSimPracticas listaPracticas2 = new ListaSimPracticas();
        listaPracticas2.addInicio(practica4);
        listaPracticas2.addFinal(practica5);
        listaPracticas2.addFinal(practica6);

       
        Evaluacion evaluacion4 = new Evaluacion(85, 1);
        Evaluacion evaluacion5 = new Evaluacion(90, 2);
        Evaluacion evaluacion6 = new Evaluacion(93, 3);

       
        ListaDobleEvaluacion listaEvaluaciones2 = new ListaDobleEvaluacion();
        listaEvaluaciones2.addIni(evaluacion4);
        listaEvaluaciones2.addFin(evaluacion5);
        listaEvaluaciones2.addFin(evaluacion6);

        
        Estudiante estudiante2 = new Estudiante(67890, 22, "Ana", "López", "Martínez", listaPracticas2, listaEvaluaciones2);

      
        Practica practica7 = new Practica("2023-06-16", "Programación en Java");
        Practica practica8 = new Practica("2023-06-17", "Estructuras de Datos");
        Practica practica9 = new Practica("2023-06-18", "Sistemas Operativos");

      
        ListaSimPracticas listaPracticas3 = new ListaSimPracticas();
        listaPracticas3.addInicio(practica7);
        listaPracticas3.addFinal(practica8);
        listaPracticas3.addFinal(practica9);

        Evaluacion evaluacion7 = new Evaluacion(78, 1);
        Evaluacion evaluacion8 = new Evaluacion(82, 2);
        Evaluacion evaluacion9 = new Evaluacion(85, 3);

       
        ListaDobleEvaluacion listaEvaluaciones3 = new ListaDobleEvaluacion();
        listaEvaluaciones3.addIni(evaluacion7);
        listaEvaluaciones3.addFin(evaluacion8);
        listaEvaluaciones3.addFin(evaluacion9);

       
        Estudiante estudiante3 = new Estudiante(11223, 21, "Carlos", "Ramírez", "Sánchez", listaPracticas3, listaEvaluaciones3);

        ListaDobleCirEstudiantes listaEstudiantes = new ListaDobleCirEstudiantes();
        listaEstudiantes.addInicio(estudiante1);
        listaEstudiantes.addFin(estudiante2);
        listaEstudiantes.addFin(estudiante3);

       
        System.out.println("Lista de estudiantes y sus prácticas y evaluaciones:");
        listaEstudiantes.mostrarListaDobleCircularEstudiantes();
    }
    
   
}
