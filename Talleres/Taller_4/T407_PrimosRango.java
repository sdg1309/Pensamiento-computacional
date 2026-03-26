package Talleres.Taller_4;

import java.util.Scanner;

public class T407_PrimosRango {
    public static int ContPrimo(int A, int B) {
        int NumPrime = 0;

        for (int i = A; i != B; i++) {

            int j = 0;

            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    j++;
                }
            }

            if (j == 1) {
                NumPrime++;
            }

        }

        return NumPrime;

    }

    public static int EsPrimo(int i) {

        int j = 0;

        for (int k = 1; k < i; k++) {
            if (i % k == 0) {
                j++;
            }
        }

        if (j == 1) {
            return i;
        }

        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt() + 1;
        sc.close();

        int NumPrime = ContPrimo(A, B);

        int[] Primos = new int[NumPrime];
        int contador = 0;

        for (int i = A; i != B; i++) {
            if (EsPrimo(i) != 0) {
                Primos[contador] = i;
                contador++;
            }
        }

        int sum = 0;

        for (int i : Primos) {
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
