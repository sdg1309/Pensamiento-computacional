package Talleres.Taller_7;

public class T702_Punto {
    private double x;
    private double y;

    public T702_Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
        
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public static double distancia(T702_Punto p1, T702_Punto p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }
}