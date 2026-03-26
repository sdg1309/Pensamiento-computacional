package Talleres.Taller_4;

import java.util.Scanner;

public class T406_WithoutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String base = sc.nextLine();
        String rm = sc.nextLine();

        sc.close();

        System.out.println(base.replaceAll(rm, ""));
    }
}
