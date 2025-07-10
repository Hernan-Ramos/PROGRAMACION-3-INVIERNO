package clase_03;

public class Mascota{
    public String nombre,raza,sexo;
    public int edad;
    public Mascota(String nombre,String raza,String sexo,int edad){
        this.nombre = nombre;
        this.raza= raza;
        this.sexo= sexo;
        this.edad = edad;
    }
    public void mostrarMascota(){
        System.out.println(" nombre:   " + this.nombre + "  sexo: " + this.sexo + " raza: " + this.raza + " edad: " + this.edad);
    }

    public String getNombre(){
        return this.nombre;

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
