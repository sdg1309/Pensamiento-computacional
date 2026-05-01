package Talleres.Taller_8.T801_T802_Juego;

public class Juego {

    private Monstruo[] monstruos;

    // Constructor vacio
    public Juego() {

        monstruos = new Monstruo[4];

        monstruos[0] = new Orco("Garnag", 10, "grrr");
        monstruos[1] = new Dragon("Brenton", 20, "metal");
        monstruos[2] = new Orco("Rogthun", 5, "purr");
        monstruos[3] = new Dragon("Shenlong", 40, "cuero");
    }

    // Metodo moverMonstruos
    public void moverMonstruos() {

        for (int i = 0; i < monstruos.length; i++) {
            monstruos[i].moverse();
        }
    }
}