package clase_12;

public class nodosimpracticas {
	private Practica dat;
	private nodosimpracticas sig;
	public nodosimpracticas() {
		super();
		this.sig = null;
	}
	public Practica getDat() {
		return dat;
	}
	public void setDat(Practica dat) {
		this.dat = dat;
	}
	public nodosimpracticas getSig() {
		return sig;
	}
	public void setSig(nodosimpracticas sig) {
		this.sig = sig;
	}
	
	

}
