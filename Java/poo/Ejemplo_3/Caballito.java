package poo.Ejemplo_3;

public class Caballito extends Mamifero {
    private String comida;
    private int ejercicio = 1; //nº de veces/día que hace ejercicio
 
    public Caballito() {
        super();
    }
    public Caballito(String nombre, String tipo_alimentacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }
 
    public String getComida() {
        return comida;
    }
 
    public void setComida(String comida) {
        this.comida = comida;
    }
 
    public int getEjercicio() {
        return ejercicio;
    }
 
    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }
    public String toString() {
        return super.toString() + ", " + this.comida + ", " + this.ejercicio;
    }
}