package Talleres.Taller_4;

import java.util.Scanner;

public class PromedioDiferencia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n > 100){
            System.out.println("-1");
        }

        else{
            double[] list = new double[n];

            for(int i = 0; i < n; i++){
                list[i] = sc.nextDouble();
            }
            sc.close();

            double prom = 0;

            for(int i = 0; n > i; i++){
                prom += list[i];
            }

            prom = prom/n;

            double max = 0.0;

            for(int i = 0; i < n-1; i++){
                double dif = Math.abs(list[i] - list[i+1]);
                if (dif > max) {
                    max = dif;
                }
            }

            System.out.printf("%.2f %.2f",prom, max);
        }

    }
}
