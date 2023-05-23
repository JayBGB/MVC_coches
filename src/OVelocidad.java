import java.util.Observable;
import java.util.Observer;

public class OVelocidad implements Observer {
    View miVista = new View();

    /**
     * Observa cuando cambia la velocidad
     * @param o     the observable object.
     * @param arg   an argument passed to the {@code notifyObservers}
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        //Debemos castear el objeto a Coche
        Coche obxC = (Coche) arg;
        miVista.muestraVelocidad(obxC.matricula, obxC.velocidad);
    }
}