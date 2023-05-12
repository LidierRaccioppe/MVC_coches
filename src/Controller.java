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

                // instanciamos al observador
                ObserverVelocidad observoVelocidad = new ObserverVelocidad();
                miModelo.addObserver(observoVelocidad);

                // instanciamos un segundo observador
                ObserverOtro otroObservador = new ObserverOtro();
                miModelo.addObserver(otroObservador);

                // Crear tres coches

                miModelo.crearCoche("LaFerrari", "SBC 1234");
                miModelo.crearCoche("Alpine", "HYU 4567");
                miModelo.crearCoche("Aston Martin", "FGH 3333");

                Coche ferrari = Model.getCoche("SBC 1234");
                // modifica la velocidad
                miModelo.subirVelocidad("SBC 1234", 30);

                // otro cambio de velocidad
                miModelo.bajarVelocidad("HYU 4567", 100);

        }

        /**
         *
         * @param modelo model of the Coche
         * @param matricula
         */
        public void crearCoche(String modelo, String matricula) {
                miModelo.crearCoche(modelo, matricula);
        }
}