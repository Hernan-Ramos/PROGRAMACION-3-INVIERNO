package clase_09;

public class proyecto {
	public String nomproyecto,area,fechadeincio,fechafin;
	public double inversion;
	public Listas listaestudiante;
	public Listac listaprofesor;
	
	
	public proyecto(String nomproyecto, String area, String fechadeincio, String fechafin, double inversion,
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

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
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
	    System.out.println("Proyecto: " + nomproyecto + ", Área: " + area + ", Fecha de inicio: " + fechadeincio + ", Fecha de fin: " + fechafin + ", Inversión: $" + inversion + ", ");
	    System.out.println("Estudiantes: "); listaestudiante.mostrarListaSimple();
	    System.out.println(" Profesores: "); listaprofesor.mostrarListaCircular();
	    System.out.println(" ");
	    System.out.println("-----------------------------------------------------------------------------");
	}
	
	public void mostrarDatosProyecto() {
	    System.out.println("Proyecto: " + nomproyecto + ", Área: " + area + ", Fecha de inicio: " + fechadeincio + ", Fecha de fin: " + fechafin + ", Inversión: $" + inversion);
	    System.out.println(" ");
	}


	
}
