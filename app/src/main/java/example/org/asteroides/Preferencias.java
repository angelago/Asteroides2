package example.org.asteroides;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Vespertino on 02/11/2017.
 */

public class Preferencias extends PreferenceActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreferenciasFragment())
                .commit();
    }
}
