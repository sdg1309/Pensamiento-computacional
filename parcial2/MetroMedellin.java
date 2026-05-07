package parcial2;

class Transporte {
protected String nombre;
protected int capacidad;
public Transporte(String nombre, int capacidad) {
this.nombre = nombre;
this.capacidad = capacidad;
}
public double calcularIngreso(double tarifa) {
return capacidad * tarifa;
}
public void mostrarInfo(double tarifa) {
System.out.println("Transporte: " + nombre + ", capacidad: " + capacidad
+ ", ingreso: " + calcularIngreso(tarifa));
}
}

class Metro extends Transporte {
private int vagones;
public Metro(String nombre, int capacidad, int vagones) {
super(nombre, capacidad);
this.vagones = vagones;
}
@Override
public double calcularIngreso(double tarifa) {
return super.calcularIngreso(tarifa) + vagones * 50;
}
}

class Bus extends Transporte {
private int rutas;
public Bus(String nombre, int capacidad, int rutas) {
super(nombre, capacidad);
this.rutas = rutas;
}
@Override
public double calcularIngreso(double tarifa) {
return super.calcularIngreso(tarifa) + rutas * 20;
}
}

public class MetroMedellin {
public static void main(String[] args) {
Transporte t1 = new Metro("Metro Línea A", 200, 6);
Transporte t2 = new Bus("Bus Circular", 50, 3);
t1.mostrarInfo(5000);
t2.mostrarInfo(2000);
}
}