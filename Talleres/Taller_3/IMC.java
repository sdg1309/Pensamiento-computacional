package Talleres.Taller_3;

import java.util.Scanner;

public class IMC {
    public static String clasificarIMC(double peso, double altura) {
        double den = altura * altura;
        double IMC = (peso / den);

        if(IMC <= 18.5){
            return "Bajo peso";
        }

        else if(IMC > 18.5 && IMC <= 24.9){
            return "Peso normal";
        }

        else if(IMC > 25.0 && IMC <= 29.9){
            return "Sobrepeso";
        }

        else if(IMC > 30.0 && IMC <= 34.9){
            return "Obesidad grado I";
        }

        else if(IMC > 35.0 && IMC <= 39.9){
            return "Obesidad grado II";
        }

        else{
            return "Obesidad grado III";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        System.out.println(clasificarIMC(peso, altura));
        scanner.close();
    }
}
