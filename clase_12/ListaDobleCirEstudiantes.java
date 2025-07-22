package clase_12;

public class ListaDobleCirEstudiantes {
	private nodocest top;

	public ListaDobleCirEstudiantes() {
		super();
		this.top = null;
	}

	public nodocest getTop() {
		return top;
	}

	public void setTop(nodocest top) {
		this.top = top;
	}
	public boolean esVacia() {
		return getTop()==null;
	}
	public void addInicio(Estudiante x) {
		nodocest nuevo =new nodocest();
		nuevo.setDat(x);
		if(this.esVacia()) {
			setTop(nuevo);
			nuevo.setAnt(nuevo);
			nuevo.setSig(nuevo);
		}
		else {
			nodocest p =getTop().getAnt();
			nuevo.setSig(top);
			top.setAnt(nuevo);
			nuevo.setAnt(p);
			p.setSig(nuevo);
			setTop(nuevo);
			
		}
	}
	public void addFin(Estudiante x) {
		nodocest nuevo =new nodocest();
		nuevo.setDat(x);
		if(this.esVacia()) {
			setTop(nuevo);
			nuevo.setAnt(nuevo);
			nuevo.setSig(nuevo);
		}
		else {
			nodocest p =getTop().getAnt();
			
			
			p.setSig(nuevo);
			nuevo.setAnt(p);
			nuevo.setSig(top);
			top.setAnt(nuevo);
			
			
		}
	}

	public nodocest delInicio() {
		if(this.esVacia()) {
			System.out.println("lista vacia");
			return null;
		}
		else {
			nodocest p =getTop();
			if(p.getSig() == top){
				setTop(null);
				return p;
			}
			nodocest q =getTop().getAnt();
			top = top.getSig();
			p.setSig(null);
			p.setAnt(null);
			
			q.setSig(top);
			top.setAnt(q);
			return p;
			
		}
	}
	
	public nodocest delFin() {
		if(this.esVacia()) {
			System.out.println("lista vacia");
			return null;
		}
		else {
			nodocest p =getTop();
			if(p.getSig() == top){
				setTop(null);
				return p;
			}
			nodocest q =getTop().getAnt();
			nodocest r =q.getAnt();
			r.setSig(top);
			top.setAnt(r);
			q.setSig(null);
			q.setAnt(null);
			return q;
			
		}
	}
	
	public void mostrarListaDobleCircularEstudiantes() {
		if(esVacia()) {
			System.out.println("Lista vacia");
		}
		else {
			nodocest p =getTop();
			while(p.getSig() != top) {
				p.getDat().mostrarEstudiante();
				p =p.getSig();
				
			}
			p.getDat().mostrarEstudiante();
		}
		
	}
	
	
	public int nronodos() {
	    int c = 0;
	    nodocest p = getTop();
	    while (p != null) {
	        c++;
	        p = p.getSig();
	    }
	    return c;
	}

	
	
}
