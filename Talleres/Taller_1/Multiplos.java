package Talleres.Taller_1;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        sc.close();

        int res = a%b;
        
        if(res != 0){
            System.out.print("no");
        }
        
        else{
            System.out.print("si");
        }

        
    }
}