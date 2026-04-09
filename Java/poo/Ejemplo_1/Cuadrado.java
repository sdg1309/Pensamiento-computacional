package poo.Ejemplo_1;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        this.lado = 0; // valor por defecto
    }

    // Gets
    public double getLado() {
        return this.lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return lado * 4;
    }

    // Sets
    public void setLado(double lado) {
        this.lado = lado;
    }

}
