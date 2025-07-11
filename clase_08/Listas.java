package clase_08;

public class Listas {
	public nodos top;

	public Listas() {
		super();
		this.top = null;
	}

	public nodos getTop() {
		return top;
	}

	public void setTop(nodos top) {
		this.top = top;
	}
	public boolean esVacia() {
		return (getTop()==null)? true:false;
	}
	public void addInicio(Estudiante x) {
		nodos nuevo = new nodos();
		nuevo.setDato(x);
		if(esVacia()) {
			setTop(nuevo);
		}
		else {
			nuevo.setSiguiente(top);
			setTop(nuevo);
		}
		
	}
	
	public void addFinal(Estudiante x) {
	    nodos nuevo = new nodos();
	    nuevo.setDato(x);
	    if(esVacia()) {
	        setTop(nuevo);
	    } else {
	        nodos puntero = getTop();
	        while(puntero.getSiguiente() != null) {
	            puntero = puntero.getSiguiente();
	        }
	        puntero.setSiguiente(nuevo);
	    }
	}

	public nodos delInicio() {
		if(esVacia()) {
			System.out.println("Lista Vacia");
			return null;
		}
		else {
			nodos p= getTop();
			if(p.getSiguiente() == null) {
				setTop(null);
				return p;			}
			else {
				top = top.getSiguiente();
				p.setSiguiente(null);
				return null;
				
			}
		}
	}
	public nodos delFinal() {
	
		if(esVacia()) {
			System.out.println("lista vacia");
			return null;
		}
		else {
			nodos p =new nodos();
			p = getTop();
			if(p.getSiguiente() ==null) {
				setTop(null);
				return p;
			}
			else {
				nodos q= getTop();
				while(p.getSiguiente() != null) {
					q = p;
					p= p.getSiguiente();
				}
				q.setSiguiente(null);
				return p;
			}
		}
	}
	
	public void mostrarListaSimple() {
		if(esVacia()) {
			System.out.println("Lista Vacia");
		}else {
			nodos p = getTop();
			while(p!= null) {
				p.getDato().mostrarEstudiante();
				p=p.getSiguiente();
			}
		}
		
	}
	
}
