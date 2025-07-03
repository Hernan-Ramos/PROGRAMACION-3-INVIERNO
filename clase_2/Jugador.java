package clase_2;

public class Jugador {
    public  String nombre;
    public String carnet;
    public String sexo;
    public int edad;
    public String posicion;

    public Jugador(String nombre,String carnet,String sexo, int edad, String posicion) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.sexo = sexo;
        this.edad = edad;
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", carnet='" + carnet + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
