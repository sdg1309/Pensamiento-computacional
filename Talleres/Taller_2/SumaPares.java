package Talleres.Taller_2;

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        for(int i = 1; i <= n; i++){
            int val = sc.nextInt();

            if(val%2 == 0){
                total = val + total;
            }
        }

        System.out.println(total);

        sc.close();
    }
}