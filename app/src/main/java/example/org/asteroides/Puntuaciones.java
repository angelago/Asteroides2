package example.org.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Vespertino on 06/11/2017.
 */

/*public class Puntuaciones extends ListActivity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                MainActivity.almacen.listaPuntuaciones(10)));
    }
}*/

//listView personalizados
public class Puntuaciones extends ListActivity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        /*setListAdapter(
                new ArrayAdapter(this,
                        R.layout.elemento_lista,
                        R.id.titulo,
                        MainActivity.almacen.listaPuntuaciones(10)));*/
        setListAdapter(new MiAdaptador(this,
                MainActivity.almacen.listaPuntuaciones(10)));
    }

    //Detectar una pulsación sobre un elemento de la lista
    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
        Object o = getListAdapter().getItem(position);
        Toast.makeText(this, "Selección: " + Integer.toString(position) +  " - " + o.toString(), Toast.LENGTH_LONG).show();
    }
}
