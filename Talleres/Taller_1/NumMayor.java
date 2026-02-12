package Talleres.Taller_1;

import java.util.Scanner;

public class NumMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        
        sc.close();
        
        if(n1 >= n2 && n1 >= n3){
            System.out.print(n1);
        }
        
        else if(n2 >= n1 && n2 >= n3){
            System.out.print(n2);
        }
        
        else{
            System.out.print(n3);
        }
    }

}