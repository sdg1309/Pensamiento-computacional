package Talleres.Taller_1;

import java.util.Scanner;

public class ImpuestoSolidario{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();
        String cont = sc.next();

        if(sal > 10000000 && cont.equals("publico")){
           
            double imp = sal*0.15;
           
            System.out.format(" %.2f ", imp);
        }
        
        else{
            System.out.println("No debes aportar");
        }
       sc.close();
    }
}