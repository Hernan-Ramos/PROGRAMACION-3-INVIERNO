package clase_08;

public class proyecto {
	public String nomproyecto,area,fechadeincio,fechafin;
	public int inversion;
	public Listas listaestudiante;
	public Listac listaprofesor;
	
	
	public proyecto(String nomproyecto, String area, String fechadeincio, String fechafin, int inversion,
		Listas listaestudiante, Listac listaprofesor) {
		this.nomproyecto = nomproyecto;
		this.area = area;
		this.fechadeincio = fechadeincio;
		this.fechafin = fechafin;
		this.inversion = inversion;
		this.listaestudiante = listaestudiante;
		this.listaprofesor = listaprofesor;
	}

	public String getNomproyecto() {
		return nomproyecto;
	}

	public void setNomproyecto(String nomproyecto) {
		this.nomproyecto = nomproyecto;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFechadeincio() {
		return fechadeincio;
	}

	public void setFechadeincio(String fechadeincio) {
		this.fechadeincio = fechadeincio;
	}

	public String getFechafin() {
		return fechafin;
	}

	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}

	public int getInversion() {
		return inversion;
	}

	public void setInversion(int inversion) {
		this.inversion = inversion;
	}

	public Listas getListaestudiante() {
		return listaestudiante;
	}

	public void setListaestudiante(Listas listaestudiante) {
		this.listaestudiante = listaestudiante;
	}

	public Listac getListaprofesor() {
		return listaprofesor;
	}

	public void setListaprofesor(Listac listaprofesor) {
		this.listaprofesor = listaprofesor;
	}
	public void mostrarProyecto() {
	    System.out.print("Proyecto: " + nomproyecto + ", Área: " + area + ", Fecha de inicio: " + fechadeincio + ", Fecha de fin: " + fechafin + ", Inversión: $" + inversion + ", ");
	    System.out.print("Estudiantes: "); listaestudiante.mostrarListaSimple();
	    System.out.print(" Profesores: "); listaprofesor.mostrarListaCircular();
	}
	
	public void mostrarDatosProyecto() {
	    System.out.print("Proyecto: " + nomproyecto + ", Área: " + area + ", Fecha de inicio: " + fechadeincio + ", Fecha de fin: " + fechafin + ", Inversión: $" + inversion + ", ");
	    
	}

	
}
