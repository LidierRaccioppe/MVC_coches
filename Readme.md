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
    class ObsExceso{
    +update(Observable o, Object arg)
    }
    class ObserverOtro{
    +update(Observable o, Object arg)
    }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    Model "1" *-- "1" ObserverVelocidad : association
    Model "1" *-- "1" ObsExceso : association
    Model "1" *-- "1" ObserverOtro : association
    
      
```

---

## Diagrama de Secuencia

Ejemplo básico del procedimiento, con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant ObsExceso
    participant View
    Controller->>Model: subirVelocidad("BXK 1234",30)
    activate Model
    Model-->>ObsExceso: update()
    deactivate Model
    Controller->>Model: subirVelocidad("BXK 1234",300)
    activate Model
    Model-->>ObsExceso: update()
    deactivate Model
    activate ObsExceso
    ObsExceso-->>View: update()
    deactivate ObsExceso
    Controller->>Model: subirVelocidad("BXK 1234",20)
    activate Model
    Model-->>ObsExceso: update()
    deactivate Model
    activate ObsExceso
    ObsExceso-->>View: update()
    deactivate ObsExceso
```