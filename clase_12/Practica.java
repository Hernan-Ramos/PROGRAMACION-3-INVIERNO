package clase_12;

public class Practica {
	private String fecha,tema;

	public Practica(String fecha, String tema) {
		this.fecha = fecha;
		this.tema = tema;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}


	public void  mostrarPractica() {
		System.out.println("Practica [fecha=" + fecha + ", tema=" + tema + "]");
	}
	
	
	
}
