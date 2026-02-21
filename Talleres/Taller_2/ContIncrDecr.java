package Talleres.Taller_2;

import java.util.Scanner;

public class ContIncrDecr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n1 = 0.0, n2 = 0.0;
        int i = 0;
        while (true) {
            n2 = sc.nextDouble();

            if(n2 == 0){
                System.out.println("Contador: " + i);
                sc.close();
                break;
            }

            if(n1 <= n2){
                i++;
                System.out.println("+1");
            }

            else if(n1 >= n2){
                i--;
                System.out.println("-1");
            }
            
            n1 = n2;
        }
    }

}
