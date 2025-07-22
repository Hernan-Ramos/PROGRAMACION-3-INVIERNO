package clase_12;

public class nodocest {
	private Estudiante dat;
	private nodocest sig;
	private nodocest ant;
	public nodocest() {
		
		this.sig = null;
		this.ant = null;
	}
	public Estudiante getDat() {
		return dat;
	}
	public void setDat(Estudiante dat) {
		this.dat = dat;
	}
	public nodocest getSig() {
		return sig;
	}
	public void setSig(nodocest sig) {
		this.sig = sig;
	}
	public nodocest getAnt() {
		return ant;
	}
	public void setAnt(nodocest ant) {
		this.ant = ant;
	}
	
	
	
}
