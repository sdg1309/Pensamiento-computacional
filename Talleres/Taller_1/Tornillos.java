package Talleres.Taller_1;

import java.util.Scanner;

public class Tornillos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo = sc.nextInt();
        int cant = sc.nextInt();

        sc.close();

        if(tipo == 1){
            System.out.println(cant*2);
        }
        else if (tipo == 2) {
            System.out.println(cant*5);
        }
        else{
            System.out.println(cant*8);
        }

    }
}