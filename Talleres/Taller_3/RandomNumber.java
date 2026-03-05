package Talleres.Taller_3;

import java.util.Random;

public class RandomNumber {
    public static void generateRandom(){

        Random r = new Random(1234);

        int r1 = r.nextInt(99);

        System.out.println(r1);        
    } 

    public static void main(String[] args) {
        generateRandom();
    }
}
