package Talleres.Taller_4;

import java.util.Scanner;

public class T408_FactorPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        if (n <= 0) {
            System.out.println(-1);
        }

        int[] fact = new int[100];
        int cont = 0;

        int num = n;

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                fact[cont++] = i;
                num = num / i;
            }
        }

        if (num > 1) {
            fact[cont++] = num;
        }

        for (int i = 0; i < cont; i++) {
            System.out.print(fact[i] + " ");
        }
    }
}
