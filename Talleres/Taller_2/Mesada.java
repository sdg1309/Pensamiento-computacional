package Talleres.Taller_2;

import java.util.Scanner;

public class Mesada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        while (true) {
            int mon = sc.nextInt();

            if(mon > 500){
                System.out.println(name + " eres mi angel");
                sc.close();
                break;
            } 

            else System.out.println(name + " me decepcionas");
        }
    }
}
