package example.org.asteroides;

import java.util.Vector;

/**
 * Created by Vespertino on 06/11/2017.
 */

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones{
    private Vector puntuaciones;

    public AlmacenPuntuacionesArray() {
        puntuaciones= new Vector();
        puntuaciones.add("123000 Pepito Domingez");
        puntuaciones.add("111000 Pedro Martinez");
        puntuaciones.add("011000 Paco Pérez");
    }
    public void guardarPuntuacion(int puntos, String nombre, long fecha) {
        puntuaciones.add(0, puntos + " "+ nombre);
    }
    public Vector listaPuntuaciones(int cantidad) {
        return  puntuaciones;
    }
}
