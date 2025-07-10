package clase_07;

public class ListaCircular {
	public Nodo top;

	public ListaCircular(Nodo top) {
		super();
		this.top = top;
	}

	public Nodo getTop() {
		return top;
	}

	public void setTop(Nodo top) {
		this.top = top;
	}
	public boolean esVacia() {
		return top == null;
	}
	public void addPrimero(profesor x) {
		Nodo nuevo = new Nodo();
		nuevo.setDato(x);
		if(esVacia()) {
			this.setTop(nuevo);
			nuevo.setSiguiente(nuevo);
		}
		else {
			Nodo p = getTop();
			while(p.getSiguiente() != top) {
				p= p.getSiguiente();
			}
			nuevo.setSiguiente(top);
			p.setSiguiente(nuevo);
			setTop(nuevo);
			
		}
	}
	public void mostarListaCircular() {
		Nodo p = getTop();
		while(p.getSiguiente()!=top) {
			p.getDato().mostrarProfesor();
			p = p.getSiguiente();
		}
		p.getDato().mostrarProfesor();
	}
	public void addUltimo(profesor x) {
	    Nodo nuevo = new Nodo();
	    nuevo.setDato(x);
	    
	    if (esVacia()) {
	        setTop(nuevo);
	        nuevo.setSiguiente(nuevo);
	    } else {
	        Nodo p = getTop();
	        while (p.getSiguiente() != top) {
	            p = p.getSiguiente();
	        }
	        p.setSiguiente(nuevo);
	        nuevo.setSiguiente(top);
	    }
	}
	public void buscarporCarnet(int ci) {
		Nodo p = getTop();
		boolean sw = false;
		while(p != top) {
			if(p.getDato().getCi() == ci) {
				p.getDato().mostrarProfesor();
				sw =true;
			}
			p = p.getSiguiente();
		}
		if(!sw) {
			System.out.println("no se encontro ese carnet");
		}
	}
	public void mbuscarporCarnet(int ci) {
	    Nodo p = getTop();
	    boolean sw = false;

	    if (p != null) {
	        while (true) {
	            if (p.getDato().getCi() == ci) {
	            	System.out.println("Profesor encontrado  con carnet  " + ci + " :" );
	                p.getDato().mostrarProfesor();
	                sw = true;
	            }
	            p = p.getSiguiente();
	            if (p == top) {
	                break;
	            }
	        }
	    }

	    if (!sw) {
	        System.out.println("no se encontro ese carnet");
	    }
	}
	public Nodo eliminarPrimero() {
	    if (esVacia()) {
	        System.out.println("Lista vacía");
	        return null;
	    }

	    Nodo eliminado = top;

	    // Caso único nodo
	    if (top.getSiguiente() == top) {
	        top = null;
	    } else {
	        Nodo ultimo = top;
	        while (ultimo.getSiguiente() != top) {
	            ultimo = ultimo.getSiguiente();
	        }
	        top = top.getSiguiente();
	        ultimo.setSiguiente(top);
	    }

	    eliminado.setSiguiente(null); // Limpieza opcional
	    return eliminado;
	}
	public Nodo eliminarUltimo() {
	    if (esVacia()) {
	        System.out.println("Lista vacía");
	        return null;
	    }

	    Nodo eliminado;

	    
	    if (top.getSiguiente() == top) {
	        eliminado = top;
	        top = null;
	    } else {
	        Nodo anterior = top;
	        Nodo actual = top.getSiguiente();
	        
	       
	        while (actual.getSiguiente() != top) {
	            anterior = actual;
	            actual = actual.getSiguiente();
	        }

	        eliminado = actual;
	        anterior.setSiguiente(top);
	    }

	    eliminado.setSiguiente(null); 
	    return eliminado;
	}


	
}
