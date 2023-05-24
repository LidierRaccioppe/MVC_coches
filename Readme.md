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
          +subirVelocidad(String matricula, Interger velocidad)
          +bajarVelocidad(String modelo, Interger velocidad)
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

Ejemplo básico del procedimiento, con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant ObserverVelocidad
    participant View
    View->>Controller: actionPerformed(buscar)
    activate Controller
    Controller->>Model: getCoche(String matricula, Integer ve)
    deactivate Controller
    activate Model
    Model->>Model: getCoche(String matricula, Integer ve)
    Model->>Model: toString()
    Model-->>Controller: getCoche(String matricula, Integer ve)+toString()
    deactivate Model
    activate Controller
    Controller-->>View: getCoche(String matricula, Integer ve)+toString()
    deactivate Controller
    activate View 
    View->>View: System.out.println()
    deactivate View
```

## Pasos que hice para cambiar el codigo

Para crear una rama con git branch 'ex3',
hacer checkout a la rama nueva,
tendre que hacer cambios en las ramas por tener la rama con velocidad subir y bajar diferente
a la de la interface,
agregar los metodos de subir, bajar y buscar en el controller para respetar a MVC,
cada uno llama a los metodos con nombre correspondiente en model, buscar a getCoche y con un
sout para que los muestre,
agregar los eventos de subir, bajar y buscar en la UI para respetar a MVC y que se vea