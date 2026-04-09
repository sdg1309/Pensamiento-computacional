package poo.Ejemplo_1;

public class principal {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado();

        Rectangulo r1 = new Rectangulo();

        Triangulo t1 = new Triangulo();

        c1.setLado(10);
        c2.setLado(30);

        r1.setLados(10, 30);

        t1.setLados(10, 5, 3);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

    }
}
