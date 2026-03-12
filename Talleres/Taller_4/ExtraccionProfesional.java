package Talleres.Taller_4;

import java.util.Scanner;

public class ExtraccionProfesional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        String sub_str = "";

        String[] myArray = str.split("><");

        for (String s : myArray) {
            int op = s.indexOf(">") + 1;
            int cl = s.indexOf("<", op);
            sub_str += s.substring(op, cl);
        }

        System.out.println(sub_str);

    }
}
