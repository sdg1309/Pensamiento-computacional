package Talleres.Taller_8;

import Talleres.Taller_8.T801_T802_Juego.Monstruo;

public class T803_Orco extends Monstruo {

    // Atributo
    private String sonido;

    // Constructor
    public T803_Orco(String nombre, int sangre, String sonido) {
        super(nombre, sangre);
        this.sonido = sonido;
    }

    // Getter de sonido
    public String getSonido() {
        return sonido;
    }

    // Setter de sonido
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    // Metodo imprimirNombre
    public void imprimirNombre() {
        System.out.println(getNombre());
    }
}

