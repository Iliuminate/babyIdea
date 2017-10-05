package com.iliuminate.myfreebabyshop.RestServices;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by cdiaza on 04/10/2017.
 */

public class Rest {

    private static Context context;

    private static Rest sSoleInstance = null;

    private Rest(Context contextFull) {
        this.context = contextFull;

        RequestQueue queue = Volley.newRequestQueue(contextFull);
        String url ="http://www.google.com";
    }

    /**
     * Metodo para recuperar la instancia del paquete para s
     * @param contextFull
     * @return
     */
    public static Rest getInstance(Context contextFull) {

        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new Rest(contextFull);
        }
        return sSoleInstance;
    }


    /**
     * Metodo de ejemplo para el consumo de una servicio
     */
    public static void Request()
    {
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(context);
        String url ="http://www.google.com";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        //mTextView.setText("Response is: "+ response.substring(0,500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //mTextView.setText("That didn't work!");
            }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }



    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        Rest.context = context;
    }
}
