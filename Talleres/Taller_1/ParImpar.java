package Talleres.Taller_1;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.close();
        
        if(a%2 == 0){
            System.out.println("par");
        }
        
        else{
            System.out.println("impar");
        }
        
        
    }
}
