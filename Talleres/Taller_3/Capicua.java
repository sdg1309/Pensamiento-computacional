package Talleres.Taller_3;

import java.util.Scanner;

public class Capicua {
    public static boolean esCapicua(int n){
        if(n < 10){
            return true;
        }

        int original = n;
        int invertido = 0;

        while (n > 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n /= 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (esCapicua(n)) {
            System.out.println("CAPICUA");
        } else {
            System.out.println("NO CAPICUA");
        }

        scanner.close();
    }
}
