package Talleres.Taller_7;

public class T707_Contador {

    private int conteo = 1;

    public void aumentar() {
        conteo++;
    }

    public void disminuir() {
        conteo--;
    }

    public int getConteo() {
        return conteo;
    }

}