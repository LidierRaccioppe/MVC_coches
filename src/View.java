/**
 * View
 * Where we control the UI
 * Version: Undefined
 * @LidierRaccioppe
 */
public class View {
    static IU iu;

    /**
     *
     */
    public View(){
        iu= new IU();
        iu.disGridLayout();
    }

    /**
     * Show the new velocidad of a Coche
     * @param matricula identifier of the Coche
     * @param v velocidad a Coche
     * @return
     */
    static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    /**
     * Validate if the Coche was created
     * @param matricula identifier of the Coche
     * @param v velocidad a Coche
     * @return true if the coche was created
     */
    boolean validaCrearCoche(String matricula, Integer v){
        System.out.println("El Coche Fue Creado con Exito, denada");
        return true;

    }
}
