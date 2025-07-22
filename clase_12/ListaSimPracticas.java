package clase_12;

public class ListaSimPracticas {
	private nodosimpracticas top;
	

	public ListaSimPracticas() {
		super();
		this.top = null;
	}

	public nodosimpracticas getTop() {
		return top;
	}

	public void setTop(nodosimpracticas top) {
		this.top = top;
	}
	public boolean esVacia() {
		return (getTop()==null)? true:false;
	}
	
	public void addInicio(Practica x) {
		nodosimpracticas nuevo = new nodosimpracticas();
		nuevo.setDat(x);
		if(esVacia()) {
			setTop(nuevo);
		}
		else {
			nuevo.setSig(top);
			setTop(nuevo);
		}
		
	}
	
	public void addFinal(Practica x) {
		nodosimpracticas nuevo = new nodosimpracticas();
	    nuevo.setDat(x);
	    if(esVacia()) {
	        setTop(nuevo);
	    } else {
	    	nodosimpracticas puntero = getTop();
	        while(puntero.getSig() != null) {
	            puntero = puntero.getSig();
	        }
	        puntero.setSig(nuevo);
	    }
	}

	public nodosimpracticas delInicio() {
		if(esVacia()) {
			System.out.println("Lista Vacia");
			return null;
		}
		else {
			nodosimpracticas p= getTop();
			if(p.getSig() == null) {
				setTop(null);
				return p;			}
			else {
				top = top.getSig();
				p.setSig(null);
				return p;
				
			}
		}
	}
	public nodosimpracticas delFinal() {
	
		if(esVacia()) {
			System.out.println("lista vacia");
			return null;
		}
		else {
			nodosimpracticas p =new nodosimpracticas();
			p = getTop();
			if(p.getSig() ==null) {
				setTop(null);
				return p;
			}
			else {
				nodosimpracticas q= getTop();
				while(p.getSig() != null) {
					q = p;
					p= p.getSig();
				}
				q.setSig(null);
				return p;
			}
		}
	}
	
	public void mostrarListaSimplePracticas() {
		if(esVacia()) {
			System.out.println("Lista Vacia");
		}else {
			nodosimpracticas p = getTop();
			while(p!= null) {
				p.getDat().mostrarPractica();
				p=p.getSig();
			}
		}
		
	}
	

}
