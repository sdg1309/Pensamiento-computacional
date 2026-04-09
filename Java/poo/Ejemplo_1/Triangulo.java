package poo.Ejemplo_1;

public class Triangulo {
    private double base;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo() {
        this.base = 0; // valor por defecto
        this.lado1 = 0;
        this.lado2 = 0;
    }

    // Gets
    public double getBase() {
        return this.base;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getArea() {
        double per = lado1 + lado2 + base;

        return Math.sqrt(per * (per - lado1) * (per - lado2) * (per - base));
    }

    public double getPerimetro() {
        return lado1 + lado2 + base;
    }

    // Sets

    public void setLados(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
}
