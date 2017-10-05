package com.iliuminate.myfreebabyshop.Intefaces;

import android.app.Activity;

/**
 * Created by cdiaza on 05/10/2017.
 * Se definen los metodos que se deben implementar en cada actividad
 * manejando un estandar
 */
public interface BaseActivity {
    /**
     * metodo para inicializar los elementos de cada layout y/o componentes
     */
    void InitReferencesComponents();

    /**
     * Agrega los eventos click a los componentes
     */
    void AddClickListeners();

    /**
     * Prepara la actividad para usar alertMessages
     */
    void ImplementMessages(Activity activity);

    /**
     * Todas las actividades deben tener configurado el evento onBackPressed
     */
    void onBackPressed();
}
