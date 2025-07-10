package clase_03;

public class Propietarios {
    public String nombre,direccion;
    public int telefono,edad;
    public PilaM mascotas;

    public Propietarios(String nombre, String direccion, int telefono, int edad, PilaM mascotas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.mascotas = mascotas;

    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PilaM getMascotas() {
        return mascotas;
    }

    public void setMascotas(PilaM mascotas) {
        this.mascotas = mascotas;
    }

    public void mostrarPropietario(){
        System.out.println("nombre propietario: " + this.nombre + " direccion: " + this.direccion + "  edad: " + this.edad + " telefono: "  + this.telefono);
        this.mascotas.Mostrar();
        System.out.println("----------------------------------------------");
    }
    public void mostrarDatosPropietario() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Edad: " + this.edad);
    }

}
