package Talleres.Taller_8.T801_T802_Juego;

public class Monstruo {

    private String nombre;
    private int sangre;

    public Monstruo(String nombre, int sangre) {
        this.nombre = nombre;
        this.sangre = sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSangre() {
        return sangre;
    }

    public void moverse() {
        System.out.println("Soy un monstruo que se mueve lento " + nombre);
    }
}
