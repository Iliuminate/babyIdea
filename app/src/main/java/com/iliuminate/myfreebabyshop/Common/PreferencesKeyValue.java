package com.iliuminate.myfreebabyshop.Common;

import android.content.Context;
import android.content.SharedPreferences;
import com.iliuminate.myfreebabyshop.R;

/**
 * Created by cdiaza on 04/10/2017.
 * Clase para acceder al preferences del app
 *
 */

public class PreferencesKeyValue {

    private Context context;
    private SharedPreferences sharedPref;

    private static PreferencesKeyValue sSoleInstance = null;


    private PreferencesKeyValue(Context contextFull) {
        this.context = contextFull;

        sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
    }


    /**
     * Metodo publico para recuperar la instancia singleton de las preferencias
     * @return
     */
    public static PreferencesKeyValue getInstance(Context contextFull) {

        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new PreferencesKeyValue(contextFull);
        }
        return sSoleInstance;
    }


    /**
     * Escribe un Valor en el preferences
     * @param key
     * @param value
     */
    public void WritePreferences(String key, String value)
    {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.commit();
    }


    /**
     * Recupera un valor almacenado en el preferences
     * @param key
     * @return
     */
    public String ReadPreferences(String key)
    {
        //Recuperar un valor default de la preferencias
        String defaultValue = "default value";
        //recuperamoe el valor del preferences
        return sharedPref.getString(key, defaultValue);
    }

}
