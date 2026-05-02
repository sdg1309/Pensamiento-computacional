package Talleres.Taller_8.T801_T802_Juego;

public class Orco extends Monstruo {

    private String sonido;

    public Orco(String nombre, int sangre, String sonido) {
        super(nombre, sangre);
        this.sonido = sonido;
    }

    public void imprimirNombre() {
        System.out.println(getNombre());
    }

    public String getSonido() {
        return sonido;
    }

    @Override
    public void moverse() {
        System.out.println("Soy un orco, estoy corriendo " + getNombre());
    }
}
