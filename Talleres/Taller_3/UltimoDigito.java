package Talleres.Taller_3;

import java.util.Scanner;

public class UltimoDigito {
    public static int ultimoDigito(int n) {
        double newnum = n;
        double num = newnum/10;
        double num2 = Math.floor(num);
        double res = num - num2;
        double i = res*10;
        int j = (int) i;

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(ultimoDigito(n));

        sc.close();
    }
}
