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
		return (top == null)? true:false;
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
		if(esVacia()) {
			System.out.println("lista vacia");
			
		}
		else {
			Nodo p = getTop();
			while(p.getSiguiente()!=top) {
				p.getDato().mostrarProfesor();
				p = p.getSiguiente();
			}
			p.getDato().mostrarProfesor();
		}
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
		if(esVacia()) {System.out.println("Lista vacia");}
	
		else {
			Nodo p = getTop();
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
	    Nodo p = getTop();
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
	public void addCarnet() {
		
	}
	public Nodo eliPrimero() {
		Nodo  p = getTop();
		if(esVacia()) {
			System.out.println("Lista vacia");
		}
		else {
			Nodo q = getTop();
			while(q.getSiguiente()!= top) {
				q = q.getSiguiente();
			}
			top = top.getSiguiente();
			p.setSiguiente(null);
			q.setSiguiente(top);
		}
		
		return p;
	}
	public int nronodos() {
	    if (esVacia()) {
	        return 0;
	    }

	    int contador = 1;
	    Nodo p = top;

	    while (p.getSiguiente() != top) {
	        contador++;
	        p = p.getSiguiente();
	    }

	    return contador;
	}

	
	public Nodo eliNodoCarnet(int ca) {
		Nodo p = getTop();
		
		if(nronodos() == 1 && p.getDato().getCi()==ca) {
			top = null;
		}
		else {
			
			Nodo r = p ;
			for(int i = 0; i< nronodos(); i++) {
				if(p.getDato().getCi()==ca) {
					if(i == 0) {
						p = eliPrimero();
					}
					else{
						Nodo q = p.getSiguiente();
						r.setSiguiente(q);
						p.setSiguiente(null);
						break;
					}
				}
				 r = p;
				 p = p.getSiguiente();
			}
		}
		return p;
	}
	

	
}
