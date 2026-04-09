Programacion orientada a objetos:

Las en la programacion, los metodos se ven como:
 + : es publico
 - : es privado

Para usar un objeto se requiere tener varios archivos, un archivo principal ('principal.java') y los objetos en archivos distintos.

Dentro de los archivos de objetos se va a usar mucho la palabra clave 'this'.
Este nos permite llamar al propio objeto, definiendo sus caracteristicas.

Ejemplo:

'''java
public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    .
    .
    .
}
'''



