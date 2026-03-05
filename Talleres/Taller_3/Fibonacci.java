package Talleres.Taller_3;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        int first = 0;
        int second = 1;
        int next = 0;
        int tot = 0;

        for(int i = 0; i <= n; i++){
            tot = first;

            next = second + first;

            first = second;

            second = next;
        }

        return tot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println(fibonacci(n));
    }
}
