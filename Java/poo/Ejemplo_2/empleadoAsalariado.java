package poo.Ejemplo_2;

public class empleadoAsalariado extends empleado {
    private int salario;

    public void setSalario(int s) {
        this.salario = s;
    }

    public int getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        String text = "Empleado {nombre= " + this.geNombre() + " empresa= " + this.getEmpresa() + "salario= "
                + this.salario + " }";
        return text;
    }
}
