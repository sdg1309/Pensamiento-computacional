package Talleres.Taller_2;

import java.util.Scanner;

public class Infinito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n2 = 0;

        while (true){
            n2 = sc.nextInt();

            if(n2 == 0){
                sc.close();
                break;
            }

            else{
                System.out.println(n2*3);
            }
        }

        sc.close();        
    }
}
