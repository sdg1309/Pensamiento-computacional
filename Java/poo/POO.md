# Programacion orientada a objetos

Las en la programacion, los metodos se ven como:

- "+" : es publico
- "-" : es privado

Para usar un objeto se requiere tener varios archivos, un archivo principal ('principal.java') y los objetos en archivos distintos.

Dentro de los archivos de objetos se va a usar mucho la palabra clave 'this'.
Este nos permite llamar al propio objeto, definiendo sus caracteristicas.

```java
public class Cuadrado {

    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    .
    .
    .
}
```

---

## @Override
  
Se usa cuando una clase hija **reescribe** un método que ya existe en la clase padre.

Su función principal es indicarle al compilador que ese método debe sobrescribir uno heredado.  
Esto ayuda a evitar errores, por ejemplo cuando se escribe mal el nombre del método o los parámetros no coinciden.

### Características

- Solo se usa sobre métodos.
- Mejora la legibilidad del código.
- Ayuda a aplicar el polimorfismo.
- El método en la clase hija puede cambiar el comportamiento del método heredado.

### Ejemplo @override

```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```

## super

La palabra reservada `super` se utiliza en Programación Orientada a Objetos (POO) en Java para acceder a los elementos de la clase padre desde una clase hija.

Permite reutilizar atributos, métodos y constructores heredados mediante la herencia.

---

### ¿Cómo se usa `super`?

La sintaxis básica es:

```java id="m2r8tn"
super.elemento
```

### Ejemplo super

```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {

    @Override
    void hacerSonido() {
        super.hacerSonido();
        System.out.println("Ladrido");
    }
}
```
