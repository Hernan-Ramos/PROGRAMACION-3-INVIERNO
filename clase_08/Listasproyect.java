package clase_08;
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
            nodoproyecto eliminado = top;
            top = top.getSiguiente();
            eliminado.setSiguiente(null);
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

}
