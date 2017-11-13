package example.org.asteroides;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bAcercaDe;
    public static AlmacenPuntuaciones almacen= new AlmacenPuntuacionesArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boton acerca de
        bAcercaDe =(Button) findViewById(R.id.btn_acercade);
        bAcercaDe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                lanzarAcercaDe(null);
            }
        });

        //boton salir mediante escuchador--cambiado por puntuaciones
        Button bSalir =(Button) findViewById(R.id.btn_salir);
        bSalir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                lanzarPuntuaciones(null);
            }
        });

    }



    //boton acerca de
    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }

    //boton salir - atributo onclick -sin funcionalidad, cambiado por puntuaciones
    public void salir(View view){
        finish();
    }

    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
    }

    //menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            lanzarPreferencias(null);
            return true;
        }
        if (id == R.id. acercaDe) {
            lanzarAcercaDe(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //preferencias
    public void lanzarPreferencias(View view){
        Intent i = new Intent(this, Preferencias.class);
        startActivity(i);
    }

    //boton Jugar
    public void mostrarPreferencias(View view){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String s = "música: "+ pref.getBoolean("musica",true) +", gráficos: " + pref.getString("graficos","?");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    //boton Puntuaciones
    public void lanzarPuntuaciones(View view) {
        Intent i = new Intent(this, Puntuaciones.class);
        startActivity(i);
    }
}
