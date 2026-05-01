package Talleres.Taller_7;

public class T706_Mascota {
    private int edad = 8;
    private String nombre;

    public T706_Mascota() {
        this.nombre = "Kitty";
    }

    public T706_Mascota(String nombre) {
        this.nombre = nombre;   
    }

    public T706_Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}