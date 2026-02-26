package Talleres.Taller_3;

import java.util.Scanner;

public class TablaMultiplicar {
     public static void mostrarTablaMultiplicar(int n){
        for(int i=1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        mostrarTablaMultiplicar(n);

        sc.close();
    }
}
