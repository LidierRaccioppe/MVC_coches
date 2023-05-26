import java.util.Observable;
import java.util.Observer;

/**
 * ObserverOtro
 * Another Observer of Coche (Velocidad)
 * Version: Undefined
 * @LidierRaccioppe
 */
public class ObserverOtro implements Observer {
        /**
         * This update for the observer
         * @param o   Tiene que recibir el observable
         * @param arg nombre generico para un objeto de tipo Object directo
         */
        @Override
        public void update(Observable o, Object arg) {
                System.out.println("Yo tambien me enteré que la velocidad cambio en " +
                        arg.toString());
        }
}