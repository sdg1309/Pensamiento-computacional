package Talleres.Taller_2;

import java.util.Scanner;


public class Estrellas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n0 = 0;

        while (true){
            int star = sc.nextInt();

            if(star < 0){
                break;
            }

            else{
                if(star == 0){
                    n0 = n0 + 1;
                }

                if(star == 1){
                    n1 = n1 + 1;
                }

                if(star == 2){
                    n2 = n2 + 1;
                }

                if(star == 3){
                    n3 = n3 + 1;
                }

                if(star == 4){
                    n4 = n4 + 1;
                }

                if(star == 5){
                    n5 = n5 + 1;
                }
            }
            
        }

        sc.close();

        System.out.println("0(" + n0 + ") *(" + n1 + ") **(" + n2 + ") ***(" + n3 + ") ****(" + n4 + ") *****(" + n5 + ")");
        System.out.println("Total: " + (n0 + n1 + n2 + n3 + n4 + n5));

    }
}
