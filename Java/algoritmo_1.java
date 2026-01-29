import java.util.Scanner;

public class algoritmo_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ancho_c1, ancho_c2;
        int largo_c1, largo_c2;

        int area_c1, area_c2;

        int Area_Total;

        System.out.print("Ingresse ancho casa 1: ");
        ancho_c1 = sc.nextInt();

        System.out.print("Ingresse largo casa 1: ");
        largo_c1 = sc.nextInt();

        area_c1 = ancho_c1 * largo_c1;

        System.out.print("Ingresse ancho casa 2: ");
        ancho_c2 = sc.nextInt();

        System.out.print("Ingresse largo casa 2: ");
        largo_c2 = sc.nextInt();

        sc.close();

        area_c2 = ancho_c2 * largo_c2;

        Area_Total = area_c1 + area_c2;

        System.out.print("Total metros cuadrados requeridos para las 2 casas: ");
        System.out.println(Area_Total);
    }
}
