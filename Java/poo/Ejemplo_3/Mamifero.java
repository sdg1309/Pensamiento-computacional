package poo.Ejemplo_3;

public class Mamifero extends Animal{
    private int gestacion;
 
    public Mamifero() {
        super();
    }

    public Mamifero(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad);
        this.gestacion = gestacion;
    }

    public int getGestacion(){
 
        return this.gestacion;
    }

    public void setGestacion(int gestacion){
        this.gestacion = gestacion;
    }
    
    public String toString() {
        return super.toString() + ", " + this.gestacion;
    }
}
