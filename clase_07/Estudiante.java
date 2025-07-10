package clase_07;

public class Estudiante {

    public int carnet,edad;
    public String nombre,paterno,materno;

    public Estudiante(int carnet, String nombre, String paterno, String materno, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public void mostrarEstudiante() {
        System.out.println("nombre del estudiante: " + this.nombre + " apellido paterno " + this.paterno + " apellido materno " + this.materno + " edad " + this.edad + " carnet: " +this.carnet);
    }

}
