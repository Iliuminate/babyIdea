package com.iliuminate.myfreebabyshop.Intefaces;

/**
 * Created by cdiaza on 05/10/2017.
 */
public interface BaseActivity {

    //Se definen los metodos que se deben implementar en cada actividad
    //manejando un estandar

    /**
     * metodo para inicializar los elementos de cada layout y/o componentes
     */
    void initReferencesComponents();

    /**
     * Agrega los eventos click a los componentes
     */
    void addClickListeners();

    /**
     * Prepara la actividad para usar alertMessages
     */
    void implementMessages();
}
