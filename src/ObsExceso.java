import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * ObsExceso
 * Observer of Velocidad reached from a Coche
 * Version: Undefined
 * @LidierRaccioppe
 */
public class ObsExceso implements Observer {
        /**
         * Este método es llamado siempre que la velocidad aumenta de 120 km/hr
         * El observable cuando hace el notifyObservers
         * @param o   el observable, en nuestro caso es el Model
         * @param arg el argumento pasado por el observable, el coche actualizado
         */
        @Override
        public void update(Observable o, Object arg) {
                // el argumento es tipo Object, porque es general
                // le hacemos un cast para poder trabajar con un objeto Coche
                Coche auxCoche = (Coche) arg;
                // Para que se limite a solo notificar cuando sea la velocdiad mayor de 120 km/hr
                if(auxCoche.velocidad>120){
                        JOptionPane.showMessageDialog(null,"Se esta superando la velocidad de 120 km/hr," +
                                "esta bajo su propio riesgo");
                }
                // le comunicamos a la vista que muestre la velocidad
                View.muestraVelocidad(auxCoche.matricula, auxCoche.velocidad);
        }
}