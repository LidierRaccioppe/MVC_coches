import java.util.ArrayList;
import java.util.Observable;

/**
 * Model
 * Data of the program
 * Version: Undefined
 * @LidierRaccioppe
 */
public class Model extends Observable{
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Method that increace the speed in a Coche .
     * @param matricula
     * @param v velocidad a aumentar
     */
    public void subirVelocidad(String matricula, Integer v) {
        // searche the Coche
        getCoche(matricula).velocidad = getCoche(matricula).velocidad+v;
        // Establishes the conexion
        setChanged();
        // debemos agregar el cambio
        notifyObservers(getCoche(matricula));
        // retorna la nueva velocidad ya no por que lo hace el observer
    }

    /**
     * Method that decreace the speed in a Coche.
     * @param matricula
     * @param v velocidad a reducir
     */
    public void bajarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = getCoche(matricula).velocidad-v;
        // establecemos el cambio
        setChanged();
        // debemos agregar el cambio
        notifyObservers(getCoche(matricula));
        // retorna la nueva velocidad ya no por que
    }
    /**
     * Devuelve la velocidad segun la matricula
     * @param matricula
     * @return The Velocidad of the Coche
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}