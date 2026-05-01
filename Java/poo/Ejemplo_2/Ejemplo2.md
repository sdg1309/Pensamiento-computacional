# Diagrama de clases y herencia

```mermaid
classDiagram
  
    class Persona {
        - nombre : String
        + setNombre(String n) void
        + getNombre() String
    }
    class Empleado {
        - empresa : String
        + setEmpresa(String e) void
        + getEmpresa() String
        + toString() String
    }
    class EmpleadoAsalariado {
        - salario : int
        + setSalario(float s) void
        + getSalario() float
        + toString() String
    }

    class EmpleadoConContrato{
        + toString() String
    }

    Persona <|-- Empleado
    Empleado <|-- EmpleadoConContrato
    Empleado <|-- EmpleadoAsalariado

```
