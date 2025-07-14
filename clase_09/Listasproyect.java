package clase_09;
import java.util.Scanner;
public class Listasproyect {
    private nodoproyecto top;

    public Listasproyect() {
        this.top = null;
    }

    public nodoproyecto getTop() {
        return top;
    }

    public void setTop(nodoproyecto top) {
        this.top = top;
    }

    public boolean esVacia() {
        return top == null;
    }

    public void addInicio(proyecto x) {
        nodoproyecto nuevo = new nodoproyecto();
        nuevo.setDato(x);
        if (esVacia()) {
            setTop(nuevo);
        } else {
            nuevo.setSiguiente(top);
            top.setAnterior(nuevo);
            setTop(nuevo);
        }
    }

    public void addFinal(proyecto x) {
        nodoproyecto nuevo = new nodoproyecto();
        nuevo.setDato(x);
        if (esVacia()) {
            setTop(nuevo);
        } else {
            nodoproyecto puntero = top;
            while (puntero.getSiguiente() != null) {
                puntero = puntero.getSiguiente();
            }
            puntero.setSiguiente(nuevo);
            nuevo.setAnterior(puntero);
        }
    }

    public nodoproyecto delInicio() {
        if (esVacia()) {
            System.out.println("Lista vacía");
            return null;
        } else {
        	if(top.getSiguiente() == null) {
        		setTop(null);
        		
        	}
            nodoproyecto eliminado = top;
            top = top.getSiguiente();
            eliminado.setSiguiente(null);
            top.setAnterior(null);
            return eliminado;
        }
    }

    public nodoproyecto delFinal() {
        if (esVacia()) {
            System.out.println("Lista vacía");
            return null;
        } else {
            nodoproyecto p = top;
            if (p.getSiguiente() == null) {
                top = null;
                return p;
            } else {
                nodoproyecto q = top;
                while (p.getSiguiente() != null) {
                    q = p;
                    p = p.getSiguiente();
                }
                q.setSiguiente(null);
                p.setAnterior(null);
                return p;
            }
        }
    }

    public void mostrarListaProyectos() {
        if (esVacia()) {
            System.out.println("Lista vacía");
        } else {
            nodoproyecto p = top;
            while (p != null) {
                p.getDato().mostrarProyecto();
                p = p.getSiguiente();
            }
        }
    }
    public void mostrarProyectocondocenteX() {
        Scanner lee = new Scanner(System.in);
        System.out.print("Docente que desea buscar: ");
        String docente = lee.nextLine();
        nodoproyecto p = getTop();
        boolean sw = false;

        while (p != null) {
            nodoc inicio = p.getDato().getListaprofesor().getTop();
            nodoc x = inicio;

            while (x != null && x.getSiguiente() != null) {
                if (x.getDato().getNombre().equalsIgnoreCase(docente)) {
                    p.getDato().mostrarDatosProyecto();
                    System.out.println();
                    p.getDato().getListaprofesor().mostrarListaCircular();
                    System.out.println();
                    p.getDato().getListaestudiante().mostrarListaSimple();
                   
                    sw = true;
                    break;
                }
                x = x.getSiguiente();
                if (x == inicio) break;
                
            }
           

            p = p.getSiguiente();
        }

        if (!sw) System.out.println("No hay proyectos con el docente " + docente );
    }


    public void mostrarProyectoFinalizadoX(String fecha) {
        nodoproyecto p = getTop();
        boolean sw = false;

        while (p != null) {
            String fechafin = p.getDato().getFechafin();
            if (fechafin.equalsIgnoreCase(fecha)) {
                p.getDato().mostrarProyecto();
                System.out.println(" ");
                p.getDato().getListaprofesor().mostrarListaCircular();
                System.out.println(" ");
                p.getDato().getListaestudiante().mostrarListaSimple();
                System.out.println("----------------------------------------------");
                sw = true;
            }
            p = p.getSiguiente();
        }

        if (!sw) {
            System.out.println("No hay proyectos finalizados en la fecha \"" + fecha + "\".");
        }
    }
    
    public void agregarProyectoDespuesdeProyectoX(proyecto x, String nomProyecto) {
        nodoproyecto nuevo = new nodoproyecto();
        nuevo.setDato(x);
        
        nodoproyecto p = getTop();
        System.out.println(" AGREGANDO DESPUES DEL PROYECTO " + nomProyecto);
        System.out.println("  ");

        while (p != null && !p.getDato().nomproyecto.equalsIgnoreCase(nomProyecto)) {
            p = p.getSiguiente();
        }

        if (p == null) {
            System.out.println("Proyecto con nombre '" + nomProyecto + "' no encontrado.");
            return;
        }

        nodoproyecto siguiente = p.getSiguiente();
        nuevo.setSiguiente(siguiente);
        nuevo.setAnterior(p);
        p.setSiguiente(nuevo);
    }
    
    public void cambiarProfesor() {
        nodoproyecto p = getTop();
        boolean sw = false;
        Scanner lee = new Scanner(System.in);
        System.out.println("NOMBRE DE DOCENTE ANTIGUO QUE DESEA SUSTITUIR");
        String nombreDocenteAntiguo = lee.nextLine();
        System.out.println(" ");
    	System.out.println("NOMBRE DE DOCENTE NUEVO");
    	String nombreDocentenuevo = lee.nextLine();
    	 System.out.println(" ");
    	System.out.println("CARNET DE DOCENTE NUEVO");
    	int carnetDocenteNuevo = lee.nextInt();
    	System.out.println(" ");
    	System.out.println("AREA DE DOCENTE NUEVO");
    	String areaDocenteNuevo = lee.next();
    	 System.out.println(" ");
        while (p != null) {
        	
        	Profesor docenteNuevo = new Profesor( nombreDocentenuevo, carnetDocenteNuevo,areaDocenteNuevo);
            nodoc profesores = p.getDato().getListaprofesor().getTop();
            Listas estudiantes = p.getDato().getListaestudiante();

            for (int i = 0; i < p.getDato().getListaprofesor().nrodenodos(); i++) {
                if (profesores.getDato().getNombre().equalsIgnoreCase(nombreDocenteAntiguo)) {
                	System.out.println("-----------DOCENTE ANTIGUO-----------");
                    System.out.println(profesores.getDato().getNombre());
                    System.out.println("   ");
                    System.out.println(" ");
                	profesores.setDato(docenteNuevo);
                    System.out.println("-----------DOCENTE NUEVO-----------");
                    System.out.println(profesores.getDato().getNombre());
                    System.out.println("  ");
                    System.out.println("---------- PRIMER ALUMNO ELIMINADO-----------");
                    System.out.println(estudiantes.getTop().getDato());
                    System.out.println("  ");
                    estudiantes.delInicio();
                    
                    double inversionAntigua = p.getDato().getInversion();
                    
                    System.out.println("---------- INVERSION ANTIGUA-----------");
                    System.out.println(inversionAntigua);
                    System.out.println(" ");
                    double inversionNueva = inversionAntigua - inversionAntigua * 0.7;
                    
                    p.getDato().setInversion(inversionNueva);
                    System.out.println("---------- INVERSION NUEVA-----------");
                    System.out.println(inversionNueva);
                    System.out.println(" ");
                    System.out.println(" ");
                    sw = true;
                }
                profesores = profesores.getSiguiente();
            }

            p = p.getSiguiente();
        }

        if (!sw) System.out.println("No hay tal docente");
    }

}
