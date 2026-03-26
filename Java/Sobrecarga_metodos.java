public class Sobrecarga_metodos {
    // Es si llamas 2 metodos de la <misma forma pero tienen 2 return distintos
    // Es usado para que el codigo se ejecute en uno u otro caso independiente mente

    // Ejemplo:

    public static int suma(int a, int b) {
        return a + b;
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = suma(4, 5);
        double result2 = suma(4.8, 8.9);
    }

}
