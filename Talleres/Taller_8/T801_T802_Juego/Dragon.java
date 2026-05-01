package Talleres.Taller_8.T801_T802_Juego;

public class Dragon extends Monstruo {

    private String piel;

    // Constructor
    public Dragon(String nombre, int sangre, String piel) {
        super(nombre, sangre);
        this.piel = piel;
    }

    // Metodo imprimirNombre
    public void imprimirNombre() {
        System.out.println(getNombre());
    }

    // Metodo moverse
    @Override
    public void moverse() {
        System.out.println("Soy un dragon, estoy volando " + getNombre());
    }
}