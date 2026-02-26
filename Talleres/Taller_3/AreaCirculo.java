package Talleres.Taller_3;

import java.util.Scanner;

public class AreaCirculo {
    public static double calcularAreaCirculo(double r){
        double pi = 3.1416;

        double Area = pi * (r * r);

        return Area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        System.out.format("%.2f%n", calcularAreaCirculo(r));
        sc.close();

    }
}
