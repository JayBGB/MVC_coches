public class View {
    /**
     * Muestra la velocidad del coche
     * @param matricula
     * @param v
     */
    void muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche con matrícula" + matricula + " va a una velocidad de: " + v + "km/h");
    }
}