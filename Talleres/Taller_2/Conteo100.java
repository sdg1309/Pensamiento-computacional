package Talleres.Taller_2;

import java.util.Scanner;

public class Conteo100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n2 = 0, i = 0;

        while (true){
            n2 = sc.nextInt();

            if(n2 == 0){
                System.out.println(i);
                sc.close();
                break;
            }

            if(n2 >100){
                i++;
            }
        }

        sc.close();
    }    
}
