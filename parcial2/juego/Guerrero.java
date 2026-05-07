package parcial2.juego;

public class Guerrero extends Personaje{
    private int fuerza;

    public Guerrero(String nombre, int nivel, int salud, int fuerza) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void atack(){
        System.out.println("Ataca un guerrero");
    }

    public void especial(){
        System.out.println("Ataque especial de guerrero");
    }    

}
