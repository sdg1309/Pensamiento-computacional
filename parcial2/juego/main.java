package parcial2.juego;

public class main {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("p1", 2,100);
        Personaje p2 = new Guerrero("p2", 15, 125, 20);
        Paladin p3 = new Paladin("p3", 15, 150, 40, 75);


        p1.atack();
        p2.atack();
        p3.atack();
        p3.bendicion();
        p3.especial();

    }
}
