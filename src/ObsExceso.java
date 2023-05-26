import java.util.Observable;
import java.util.Observer;
public class ObsExceso implements Observer {

    View miVista = new View();

    /**
     *
     *
     * @param o     the observable object.
     * @param arg   an argument passed to the {@code notifyObservers}
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        Coche aux = (Coche) arg;
        miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        if(aux.velocidad > 120){
            Dialog.vDialogo("¡ALERTA: VELOCIDAD EXCEDIDA!");
        }
    }
}
