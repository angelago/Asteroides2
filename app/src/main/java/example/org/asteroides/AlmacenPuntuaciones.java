package example.org.asteroides;

import java.util.Vector;

/**
 * Created by Vespertino on 06/11/2017.
 */

public interface AlmacenPuntuaciones {
    public void guardarPuntuacion(int puntos,String nombre,long fecha);
    public Vector listaPuntuaciones(int cantidad);
}
