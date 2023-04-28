public class Controller {
    static Model miModelo = new Model();
    static View miVista;
    public static void main(String[] args) {

        /*
        View miVista = new View();

        // Crear tres coches
        miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.subirVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        System.out.println(hecho);
        */
        miVista = new View();
        System.out.println("fin del mundo");

    }
    public void crearCoche(String modelo, String matricula){
        miModelo.crearCoche(modelo,matricula);
    }
}