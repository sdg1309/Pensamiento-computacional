package Talleres.Taller_2;

import java.util.Scanner;

public class Perfecto { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cont = 0;

        for(int i = 0; i != num; i++){
            cont = i + cont;
            
            if(cont == num){
                System.out.println("Es perfecto");
                break;
            }

            else if(cont > num){
                System.out.println("No es perfecto");
                break;
            }
        }

        sc.close();
    }
}