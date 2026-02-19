package Talleres.Taller_2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int first = 0;
        int second = 1;
        int next = 0;

        for(int i = 0; i < x; i++){
            System.out.println(first);
            next = second + first;

            first = second;

            second = next;
        }

        sc.close();
    }
}
