package Talleres.Taller_6;

import java.util.ArrayList;
import java.util.Scanner;

public class T604_mediaMayores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<Double>();


        int num = sc.nextInt();
        double prom = 0.0;

        for(int i = 0; i != num; i++){
            list.add(sc.nextDouble());
        }

        sc.close();

        list.sort(null);

        for (int i = 0; i < list.size(); i++) {
            prom = list.get(i) + prom;
        }

        double med = prom/list.size();
        
        System.out.println(med);

        list.removeIf(n -> n < med);
        
        System.out.println(list);
    }
}
