package poo.Ejemplo_1;

public class Rectangulo {

    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo() {
        this.ancho = 0; // valor por defecto
        this.largo = 0;
    }

    // Gets
    public double getAncho() {
        return this.ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getArea() {
        return ancho * largo;
    }

    public double getPerimetro() {
        return ancho * 2 + largo * 2;
    }

    // Sets

    public void setLados(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

}
