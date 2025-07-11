package clase_08;
public class Listac {
	public nodoc top;

	public Listac(nodoc top) {
		
		this.top = top;
	}

	public nodoc getTop() {
		return top;
	}

	public void setTop(nodoc top) {
		this.top = top;
	}
	public boolean esVacia() {
		return (top == null)? true:false;
	}
	public void addPrimero(Profesor x) {
		nodoc nuevo = new nodoc();
		nuevo.setDato(x);
		if(esVacia()) {
			this.setTop(nuevo);
			nuevo.setSiguiente(nuevo);
		}
		else {
			nodoc p = getTop();
			while(p.getSiguiente() != top) {
				p= p.getSiguiente();
			}
			nuevo.setSiguiente(top);
			p.setSiguiente(nuevo);
			setTop(nuevo);
			
		}
	}
	public void mostrarListaCircular() {
		if(esVacia()) {
			System.out.println("lista vacia");
			
		}
		else {
			nodoc p = getTop();
			while(p.getSiguiente()!=top) {
				p.getDato().mostrarProfesor();
				p = p.getSiguiente();
			}
			p.getDato().mostrarProfesor();
		}
	}
	public void addUltimo(Profesor x) {
		nodoc nuevo = new nodoc();
	    nuevo.setDato(x);
	    
	    if (esVacia()) {
	        setTop(nuevo);
	        nuevo.setSiguiente(nuevo);
	    } else {
	    	nodoc p = getTop();
	        while (p.getSiguiente() != top) {
	            p = p.getSiguiente();
	        }
	        p.setSiguiente(nuevo);
	        nuevo.setSiguiente(top);
	    }
	}
	public void buscarporCarnet(int ci) {
		if(esVacia()) {System.out.println("Lista vacia");}
	
		else {
			nodoc p = getTop();
			boolean sw = false;
			while(p.getSiguiente()!= top) {
				if(p.getDato().getCi() == ci) {
					p.getDato().mostrarProfesor();
					sw =true;
				}
				p = p.getSiguiente();
			}
			if(p.getDato().getCi() == ci) {
				sw = true;
				p.getDato().mostrarProfesor();
			}
			if(!sw) {
				System.out.println("no se encontro ese carnet");
			}
			
		}
		
	}
	public void mbuscarporCarnet(int ci) {
	    nodoc p = getTop();
	    boolean sw = false;

	    if (p!= null) {
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
	public nodoc eliminarPrimero() {
	    if (esVacia()) {
	        System.out.println("Lista vacía");
	        return null;
	    }

	    nodoc eliminado = top;

	    // Caso único nodo
	    if (top.getSiguiente() == top) {
	        top = null;
	    } else {
	    	nodoc ultimo = top;
	        while (ultimo.getSiguiente() != top) {
	            ultimo = ultimo.getSiguiente();
	        }
	        top = top.getSiguiente();
	        ultimo.setSiguiente(top);
	    }

	    eliminado.setSiguiente(null); // Limpieza opcional
	    return eliminado;
	}
	public nodoc eliminarUltimo() {
	    if (esVacia()) {
	        System.out.println("Lista vacía");
	        return null;
	    }

	    nodoc eliminado;

	    
	    if (top.getSiguiente() == top) {
	        eliminado = top;
	        top = null;
	    } else {
	    	nodoc anterior = top;
	    	nodoc actual = top.getSiguiente();
	        
	       
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
	public void addCarnet() {
		
	}
	public nodoc eliPrimero() {
		nodoc  p = getTop();
		if(esVacia()) {
			System.out.println("Lista vacia");
		}
		else {
			nodoc q = getTop();
			while(q.getSiguiente()!= top) {
				q = q.getSiguiente();
			}
			top = top.getSiguiente();
			p.setSiguiente(null);
			q.setSiguiente(top);
		}
		
		return p;
	}
}