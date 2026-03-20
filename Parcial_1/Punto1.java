package Parcial_1;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu genero: (M: masculino, F: femenino)");
        String gen = sc.nextLine();

        System.out.println("Ingresa altura en metros");
        double alt = sc.nextDouble();

        sc.close();

        if (gen.compareTo("M") == 0 || gen.compareTo("m") == 0) {
            if (alt >= 1.60) {
                System.out.println("Guardia Civil");
            } else {
                System.out.println("Policia nacional");
            }
        }

        if (gen.compareTo("F") == 0 || gen.compareTo("f") == 0) {
            if (alt >= 1.55) {
                System.out.println("Guardia Civil");
            } else {
                System.out.println("Policia nacional");
            }
        }

    }
}