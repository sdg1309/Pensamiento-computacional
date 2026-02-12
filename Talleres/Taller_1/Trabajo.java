package Talleres.Taller_1;

import java.util.Scanner;

public class Trabajo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dias = sc.nextInt();
        double sala = sc.nextDouble();

        sc.close();

        switch (dias) {
        case 1:
            sala = sala * 1.455;
            break;

        case 2:
            break;
            
        case 3:
            break;            

        case 4:
            sala = sala * 1.1;
            break;

        case 5:
            sala = sala * 1.295;
            break;

        case 6:
            sala = sala * 1.75;
            break;
        
        
        case 7:
            sala = sala * 1.75;
            break;
        }
        
        System.out.println(String.format("%.2f", sala));
    }
}
