package poo.Ejemplo_2;

public class empleado extends Persona {
    private String empresa;

    public void setEmpresa(String n) {
        this.empresa = n;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    @Override
    public String toString() {
        String text = "Empleado {nombre= " + this.geNombre() + " empresa= " + this.empresa + " }";
        return text;
    }
}
