package Talleres.Taller_7;

public class T703_Planeta {

    private String nombre;
    private double masa;

    public static int contador = 0;

    public T703_Planeta() {
        this("Tierra", 5.972);
    }

    public T703_Planeta(String nombre, double masa) {
        this.nombre = nombre;
        this.masa = masa;
        contador++;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public static T703_Planeta T703_PlanetaMedio(T703_Planeta p) {
        return new T703_Planeta(p.nombre, p.masa / 2);
    }
}
