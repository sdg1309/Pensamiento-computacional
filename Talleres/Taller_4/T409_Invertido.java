package Talleres.Taller_4;

import java.util.Scanner;

public class T409_Invertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

   
        int[] list = new int[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }
        sc.close();
        
        int cont = n - 1;

        for(int i = cont; 0 <= i; i--){
            System.out.print(list[i] + " ");
        }
        
    }
}
