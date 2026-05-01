package Talleres.Taller_7.T705_Calculadora;

import java.util.Scanner;

public class PrincipalCalculadoraSimple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculadoraSimple calc = new CalculadoraSimple();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(calc.sumar(num1, num2));

        System.out.println(calc.restar(num1, num2));

        sc.close();
    }
}
