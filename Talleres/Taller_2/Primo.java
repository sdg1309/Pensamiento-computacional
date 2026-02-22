package Talleres.Taller_2;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = 0;

        sc.close();
        if (n <= 1){
            System.out.println("No es primo");
            j++;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.println("No es primo");
                j++;
                break;
            }
        }

        if(j == 0){
            System.out.println("Es primo");
        }

    }
}
