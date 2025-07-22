package clase_12;

public class nododobleevaluacion {
	private Evaluacion dat;
	private nododobleevaluacion sig;
	private nododobleevaluacion ant;
	public nododobleevaluacion() {
		this.sig = null;
		this.ant = null;
	}
	public Evaluacion getDat() {
		return dat;
	}
	public void setDat(Evaluacion dat) {
		this.dat = dat;
	}
	public nododobleevaluacion getSig() {
		return sig;
	}
	public void setSig(nododobleevaluacion sig) {
		this.sig = sig;
	}
	public nododobleevaluacion getAnt() {
		return ant;
	}
	public void setAnt(nododobleevaluacion ant) {
		this.ant = ant;
	}
	
	
	

}
