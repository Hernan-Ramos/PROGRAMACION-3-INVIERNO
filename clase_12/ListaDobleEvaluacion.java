package clase_12;

public class ListaDobleEvaluacion {
	private nododobleevaluacion top;

	public ListaDobleEvaluacion() {
		super();
		this.top = null;
	}

	public nododobleevaluacion getTop() {
		return top;
	}

	public void setTop(nododobleevaluacion top) {
		this.top = top;
	}
	public boolean esVacia() {
		return getTop()==null;
	}
	
	public void addIni(Evaluacion x) {
		nododobleevaluacion nuevo = new nododobleevaluacion();
		nuevo.setDat(x);
		if(esVacia()) {
			setTop(nuevo);
		}
		else{
			nuevo.setSig(top);
			top.setAnt(nuevo);
			setTop(nuevo);
			
		}
	}
	public void addFin(Evaluacion x) {
		nododobleevaluacion nuevo = new nododobleevaluacion();
		nuevo.setDat(x);
		if(esVacia()) {
			setTop(nuevo);
		}
		else{
			
			nododobleevaluacion p =getTop();
			while(p.getSig() != null) {
				p = p.getSig();
			}
			p.setSig(nuevo);
			nuevo.setAnt(p);
			
		}
	}
	public nododobleevaluacion delIni() {
		if(esVacia()) {
			System.out.println("Lista vacia");
			return null;
		}
		else {
			nododobleevaluacion p = getTop();
			if(p.getSig() == null) {
				setTop(null);
				return p;
			}
			top = top.getSig();
			p.setSig(null);
			top.setAnt(null);
			return p;
		}
	}
	public nododobleevaluacion delFin() {
		if(esVacia()) {
			System.out.println("Lista vacia");
			return null;
		}
		else {
			nododobleevaluacion p = getTop();
			if(p.getSig() == null) {
				setTop(null);
				return p;
			}
			nododobleevaluacion q = getTop();
			while(p.getSig() != null) {
				q= p;
				p = p.getSig();
			}
			q.setSig(null);
			p.setAnt(null);
			return p;
			
		}
	}
	public void mostrarListaDobleEvaluacion() {
		nododobleevaluacion p = getTop();
		while(p != null) {
			p.getDat().mostrarEvaluacion();
			p = p.getSig();
		}
	}
	
	
	

}
