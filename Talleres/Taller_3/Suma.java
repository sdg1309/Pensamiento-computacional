package Talleres.Taller_3;

import java.util.Scanner;

public class Suma {
    public static int Sumas(int n1, int n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        sc.close();

        System.out.println(Sumas(n1, n2));
    }
}