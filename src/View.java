public class View {
    void muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }

    public void muestraDatosCoche(String modelo, String matricula, Integer velocidad) {
        Dialog.vDialogo("El coche con matrícula " + matricula + " es un " + modelo + " y actualmente tiene una velocidad de: " + velocidad + "km/h");
    }
}