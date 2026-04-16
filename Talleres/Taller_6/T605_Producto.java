package Talleres.Taller_6;

import java.util.ArrayList;
import java.util.Scanner;

public class T605_Producto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();


        int num = sc.nextInt();

        for(int i = 0; i != num; i++){
            list.add(sc.nextInt());
        }

        sc.close();

        int parf = 1;
        int inparf = 1;

        ArrayList<Integer> par = new ArrayList<>(list);
        ArrayList<Integer> inpar = new ArrayList<>(list);
        
        par.removeIf(n -> n % 2 != 0);
        inpar.removeIf(n -> n % 2 == 0);

        for (int i = 0; i < par.size(); i++) {
            parf = par.get(i) * parf;
        }
        System.out.println(parf);

        for (int i = 0; i < inpar.size(); i++) {
            inparf = inpar.get(i) * inparf;
        }
        System.out.println(inparf);

    }
}