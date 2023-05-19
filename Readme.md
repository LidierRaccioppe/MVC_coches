# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

---
## Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
          +crearCoche(String modelo, String matricula)
      }
      class View {+muestraVelocidad(String, Integer)
                  +validarCrearCoche(String, Integer)
    }
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +subirVelocidad(String, Integer)
          +bajarVelocidad(String, Integer)
          +getVelocidad(String)
    }
    class ObserverVelocidad{
    +update(Observable o, Object arg)
    }
    class ObserverOtro{
    +update(Observable o, Object arg)
    }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    Model "1" *-- "1" ObserverVelocidad : association
    Model "1" *-- "1" ObserverOtro : association
    
      
```

---

## Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant ObserverVelocidad
    participant View
    Controller->>Model: subirVelocidad("BXK 1234",3)
    activate Model
    Model-->>ObserverVelocidad: update()
    deactivate Model
    ObserverVelocidad->>+View: muestraVelocidad()
    activate View
    View->>-View: System.out.println()
    deactivate View
```