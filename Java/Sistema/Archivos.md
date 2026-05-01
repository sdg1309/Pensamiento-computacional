# Uso de Archivos en Java

En Java, los archivos permiten almacenar información de manera permanente en el computador.  
Se pueden crear, leer, escribir y modificar archivos utilizando clases del paquete `java.io`.

---

## Importación necesaria

Para trabajar con archivos normalmente se utiliza:

```java id="m4x8qt"
import java.io.*;
```

---

## Clase File

La clase `File` representa un archivo o carpeta dentro del sistema.

### Crear un objeto File

```java id="h7n3pw"
File archivo = new File("datos.txt");
```

Esto no crea el archivo físicamente, solo crea una referencia al archivo.

---

## Crear un archivo

Se utiliza el método `createNewFile()`.

```java id="t2v9mz"
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            File archivo = new File("datos.txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error");
        }
    }
}
```

---

## Escribir en un archivo

Para escribir texto se utiliza `FileWriter`.

```java id="c5r1fk"
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter escritor = new FileWriter("datos.txt");

            escritor.write("Hola mundo desde Java");

            escritor.close();

            System.out.println("Texto escrito correctamente");

        } catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }
}
```

---

## Agregar texto sin borrar contenido

Si se usa solo `FileWriter`, el archivo se sobrescribe.  
Para agregar contenido se usa:

```java id="p8d4ls"
FileWriter escritor = new FileWriter("datos.txt", true);
```

El parámetro `true` activa el modo append.

---

## Leer un archivo

Para leer archivos se puede utilizar `Scanner`.

```java id="y3w7bn"
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            File archivo = new File("datos.txt");

            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                System.out.println(linea);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
```

---

## Obtener información de un archivo

La clase `File` tiene métodos útiles.

```java id="n6k2vq"
File archivo = new File("datos.txt");

System.out.println(archivo.getName());
System.out.println(archivo.getAbsolutePath());
System.out.println(archivo.canRead());
System.out.println(archivo.canWrite());
System.out.println(archivo.length());
```

---

## Métodos importantes de File

| Método | Función |
| --- | --- |
| `getName()` | Obtiene el nombre del archivo |
| `getAbsolutePath()` | Ruta completa |
| `canRead()` | Verifica permisos de lectura |
| `canWrite()` | Verifica permisos de escritura |
| `length()` | Tamaño del archivo |
| `exists()` | Verifica si existe |

---

## Eliminar un archivo

```java id="s1f5xh"
File archivo = new File("datos.txt");

if (archivo.delete()) {
    System.out.println("Archivo eliminado");
} else {
    System.out.println("No se pudo eliminar");
}
```

---

## Manejo de excepciones

Trabajar con archivos puede generar errores, por ejemplo:

- Archivo inexistente
- Permisos insuficientes
- Problemas de escritura

Por eso se utiliza `try-catch`.

```java id="j8r4dc"
try {

    // Código de archivos

} catch (IOException e) {

    System.out.println("Ocurrió un error");
}
```

---

## Clases comunes para archivos en Java

| Clase | Función |
| --- | --- |
| `File` | Representa archivos o carpetas |
| `FileWriter` | Escribir archivos |
| `FileReader` | Leer caracteres |
| `BufferedReader` | Leer texto eficientemente |
| `Scanner` | Leer texto fácilmente |

---

## Flujo básico de trabajo con archivos

1. Crear el archivo
2. Escribir información
3. Leer información
4. Cerrar el archivo
5. Manejar errores con `try-catch`

---

## Ejemplo completo

```java id="u4b9me"
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            // Crear archivo
            File archivo = new File("datos.txt");

            archivo.createNewFile();

            // Escribir
            FileWriter escritor = new FileWriter("datos.txt");

            escritor.write("Hola Java");

            escritor.close();

            // Leer
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (IOException e) {

            System.out.println("Error en el manejo del archivo");
        }
    }
}
```

---

## Resumen

El manejo de archivos en Java permite:

- Crear archivos
- Leer información
- Escribir contenido
- Modificar datos
- Eliminar archivos

Las clases más importantes son:

- `File`
- `FileWriter`
- `Scanner`

Siempre es recomendable usar `try-catch` para controlar errores relacionados con archivos.
