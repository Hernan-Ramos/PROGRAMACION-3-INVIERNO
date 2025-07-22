package clase_12;

public class Evaluacion {
	private int nota,item;

	public Evaluacion(int nota, int item) {
		super();
		this.nota = nota;
		this.item = item;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
	public void mostrarEvaluacion() {
		System.out.println("Item: " + item + " Nota: " + nota);
	}
	

}
