package clase_07;

public class profesor {
	public String nombre,especialidad;
	public int ci;
	public profesor(String nombre,int ci, String especialidad) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ci = ci;
	}
	
	public profesor() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int cil) {
		this.ci = cil;
	}
	
	public void mostrarProfesor() {
	    System.out.println("Nombre: " + nombre + ", CI: " + ci + ", Especialidad: " + especialidad);
	}

	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", especialidad=" + especialidad + ", ci=" + ci + "]";
	}

	

}
