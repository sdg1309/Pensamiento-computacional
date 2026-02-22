package Talleres.Taller_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 1;

        if(num == 0){
            System.out.println(1);
        }

        else if( num > 0){
            for(int i = 1; i != num+1; i++){
                fact = i * fact;
            }
            System.out.println(fact);
        }

        sc.close();
    }
}
