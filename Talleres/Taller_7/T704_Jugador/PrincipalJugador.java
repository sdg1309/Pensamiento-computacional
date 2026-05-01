package Talleres.Taller_7.T704_Jugador;

import java.util.Scanner;

public class PrincipalJugador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jugador j = new Jugador();

        int salud = sc.nextInt();
        j.setSalud(salud);

        String nombre = sc.next();
        j.setNombre(nombre);

        int num1 = sc.nextInt();
        j.reducirSalud(num1);

        int num2 = sc.nextInt();
        j.reducirSalud(num2);

        System.out.println(j.getNombre() + j.getSalud());

        sc.close();
    }
}
