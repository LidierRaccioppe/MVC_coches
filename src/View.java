public class View {
    static IU iu;
    public View(){
        iu= new IU();
        iu.disGridLayout();
    }
    boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
    boolean validaCrearCoche(String matricula, Integer v){
        System.out.println("El Coche Fue Creado con Exito, denada");
        return true;

    }
}
