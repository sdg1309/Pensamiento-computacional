package parcial2.juego;

public class Paladin extends Guerrero{
    private int fe;

    public Paladin(String nombre, int nivel, int salud, int fuerza, int fe) {
        super(nombre, nivel, salud, fuerza);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
    
    @Override
    public void atack(){
        System.out.println("Ataca un paladin");

    }

    public void bendicion(){
        System.out.println("Te bendijo un paladin");
    }

    
}
