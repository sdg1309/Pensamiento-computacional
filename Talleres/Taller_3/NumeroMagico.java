package Talleres.Taller_3;

import java.util.Random;
import java.util.Scanner;

public class NumeroMagico {
    public static String verificarNumero(int secreto, int intento, int intentosRestantes){

        if(intento == secreto){
            return "¡Adivinaste en " + (intentosRestantes) + " intentos!";
        }

        else if(intento < secreto){
            return "Mayor";
        }

        else{
            return "Menor";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(1234);

        int r1 = r.nextInt(99);
        int newIntento;
        int cont=0;

        while (true) {
            newIntento = sc.nextInt();

            if(cont != 7){
                cont++;
                System.out.println(verificarNumero(r1, newIntento, cont));
            }

            if(cont >= 7 && r1 != newIntento){
                System.out.println("Perdiste. El número era " + r1);
                break;
            }

            if(cont == 7 || r1 == newIntento){
                break;
            }

        }
        sc.close();

    }
}
