# Manejo de Errores en Java

En Java, los errores y excepciones pueden ocurrir durante la ejecución del programa.  
Para evitar que el programa se detenga inesperadamente, se utiliza el manejo de excepciones.

---

## try y catch

### `try`

El bloque `try` contiene el código que puede generar un error.

### `catch`

El bloque `catch` captura y maneja la excepción para evitar que el programa termine de forma abrupta.

---

## Sintaxis básica

```java id="z4f7km"
    try {
        // Código que puede generar un error
    } catch (Exception e) {
        // Código para manejar el error
    }
```

### Ejemplo

```java
public class Main {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        }

        System.out.println("El programa continúa");
    }
}
```
