package Talleres.Taller_1;

import java.util.Scanner;

public class Helado2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int temp, edad;

        temp = sc.nextInt();
        edad = sc.nextInt();

        sc.close();

        if(temp > 27 && edad > 18){
            System.out.print("Comprar helado cerveza");
        }
        
        else{
            System.out.print("Lo sentimos juventud");
        }
    }
}
