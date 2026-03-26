package Talleres.Taller_4;

import java.util.Scanner;

public class T411_Redondeo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n < -1||n > 50){
            System.out.println("-1");
        }

        else{
            double[] list = new double[n];

            int up = 0, down = 0, same = 0;

            for(int i = 0; i < n; i++){
                list[i] = sc.nextDouble();
            }
            sc.close();

            double[] redon = new double[n];

            for(int i = 0; i < n; i++){
                if(0 == ((list[i]* 10)%10)){
                    redon[i] = list[i];
                    same++;
                }

                else if(5 > ((list[i]* 10)%10) ){
                    redon[i] = Math.floor(list[i]);
                    down++;
                }

                else if(5 <= ((list[i]* 10)%10) ){
                    redon[i] = Math.ceil(list[i]);
                    up++;
                }
            }
            
            for(int i = 0; i < n; i++){
                System.out.printf("%.0f ", list[i]);
            }

            System.out.printf("%d %d %d", up, down, same);
            
        }

    }
}
