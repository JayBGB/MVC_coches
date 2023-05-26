import java.util.ArrayList;
import java.util.Observable;

/**
 * Model hereda de Observable para poder notificar
 */

public class Model extends Observable {
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
     * Cambia la velocidad del coche y notifica a los observadores
     * @param matricula
     * @param v
     */
    public void cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // cambio de velocidad
        setChanged();
        // se notifica a los observadores
        notifyObservers(getCoche(matricula));
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
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
     * Al subir la velocidad se notifica a los observadores
     * @param matricula
     * @return velocidad modificada
     */
    public void subirVelocidad(String matricula) {
        // busca el coche y sube la velocidad
        getCoche(matricula).velocidad = getCoche(matricula).velocidad + 10;
        // se cambia el parámetro subiendo la velocidad
        setChanged();
        // se notifica a los observadores
        notifyObservers(getCoche(matricula));
    }

    /**
     * @param matricula
     * @return velocidad modificada
     */
    public void bajarVelocidad(String matricula) {
        // busca el coche y sube la velocidad
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - 10;
        // se cambia el parámetro bajando la velocidad
        setChanged();
        // se notifica a los observadores
        notifyObservers(getCoche(matricula));
    }

    /**
     * Devuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}