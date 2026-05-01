# Diagrama de clases y herencia

```mermaid
classDiagram|
  
    class Animal {
        - nombre : String
        - tipoAlimentacion : String
        - edad : int
        + setNombre(String n) void
        + getNombre() String
        + setTipoAlimentcacion(String t) void
        + setTipoAlimentcacion(String t) String
        + setEdad(int e) void
        + getEdad() int
    }
    class Mamifero {
        
    }
    class Caballito {
        - salario : int
        + setSalario(float s) void
        + getSalario() float
        + toString() String
    }



    Animal <|-- Mamifero
    Mamifero <|-- Caballito

```
