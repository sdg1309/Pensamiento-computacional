package poo.Ejemplo_3;

public class Animal {
    private String nombre;
    private String tipo_alimentacion;
    private int edad;
 
    public Animal() {
    }  // constructor vacio
    // animal ani1 = new animal();
    public Animal(String nombre, String tipo_alimentacion, int edad){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return this.nombre + ", " + this.tipo_alimentacion + ", " + this.edad;
    }
    
}