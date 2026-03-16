package Talleres.Taller_4;

import java.util.Scanner;

public class MayorQue {

    public static void mayor(int[] A) {

        int n1 = A[0];
        int Mayo = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > n1) {
                System.out.println(A[i]);
                Mayo++;
            }
        }

        if (Mayo == 0) {
            System.out.println("No hay ningun numero mayor que el primero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] list = new int[n];

        for(int i = 0; n > i; i++){
            list[i] = sc.nextInt();
        }

        sc.close();

        mayor(list);
    }
}