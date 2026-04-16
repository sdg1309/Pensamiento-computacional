package Talleres.Taller_5;

import java.util.Scanner;

public class T506_bordeMatriz {
    public static void procesarMatriz(int[][] matriz){

        int ord = matriz[0].length;

        for(int i = 1; i < ord-1; i++){
            for(int j = 1; j < ord-1; j++){
                matriz[i][j] = 0;
            }
        }

        for(int i = 0; i < ord; i++){
            for(int j = 0; j < ord; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ord = sc.nextInt();

        int[][] mat = new int[ord][ord];

        for(int i = 0; i < ord; i++){
            for(int j = 0; j < ord; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();


    }
}
