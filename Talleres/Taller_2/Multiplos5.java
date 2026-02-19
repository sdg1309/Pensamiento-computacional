package Talleres.Taller_2;

import java.util.Scanner;

public class Multiplos5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int div = x/5;

        for(int i = 1; i <= div; i++){
            System.out.println(i*5);
        }

        sc.close();
    }
    
}
