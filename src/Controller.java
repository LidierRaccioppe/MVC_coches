/**
 * Controller
 * Main and place where live the logic of the program
 * Version: Undefined
 * @LidierRaccioppe
 */
public class Controller {
        static Model miModelo = new Model();
        static View miVista;

        public static void main(String[] args) {

                // el patron Observer en java nos exige instanciar la clase observable
                miModelo = new Model();

                // instanciamos al observador de excesos
                ObsExceso observoExcesosPeroNoDeMaria = new ObsExceso();
                miModelo.addObserver(observoExcesosPeroNoDeMaria);

                // Crear un coche
                miModelo.crearCoche("LaFerrari", "SBC 1234");
                Coche ferrari = Model.getCoche("SBC 1234");

                // modifica la velocidad
                miModelo.subirVelocidad("SBC 1234", 30);

                // otro cambio de velocidad
                miModelo.subirVelocidad("SBC 1234", 300);

                // Para que se vea que aun se puede seguir aumentando la velocidad
                // aun después de haber superado el limite recomendado
                miModelo.subirVelocidad("SBC 1234", 20);

                // Para mostrar que velocidad se alcanzo
                System.out.println("Se alcanzo: "+ferrari.velocidad+" km/hr,");

        }

        /**
         * Method to create a Coche
         * @param modelo model of the Coche
         * @param matricula Identifier of the coche
         */
        public void crearCoche(String modelo, String matricula) {
                miModelo.crearCoche(modelo, matricula);
        }
}