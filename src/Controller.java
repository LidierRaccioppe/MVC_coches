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


                miVista = new View();
                System.out.println("fin del mundo");

        }

        /**
         * Method to create a Coche
         * @param modelo model of the Coche
         * @param matricula Identifier of the coche
         */
        public void crearCoche(String modelo, String matricula) {
                miModelo.crearCoche(modelo, matricula);
        }

        /**
         * Method to increase the speed of a Coche
         * @param v amounth of speed to increase
         * @param matricula Identifier of the coche
         */
        public void subirVelocidad(String matricula, Integer v) {
                miModelo.subirVelocidad(matricula, v);
        }

        /**
         * Method to decrease the speed of a Coche
         * @param v amounth of speed to decreasce
         * @param matricula Identifier of the coche
         */
        public void bajarVelocidad(String matricula, Integer v) {
                miModelo.bajarVelocidad(matricula, v);
        }

        /**
         * Method to search a Coche and show their data
         * @param matricula Identifier of the coche
         */
        public void buscarYMostrar(String matricula) {
                Coche aux = null;
                aux=Model.getCoche(matricula);
                aux.toString();
        }
}