package com.iliuminate.myfreebabyshop.Common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;

import com.iliuminate.myfreebabyshop.R;

/**
 * Created by cdiaza on 05/10/2017.
 */

public class AlertMessages {

    private String Title = "";
    private String Body = "";
    private String Btn1 = "Aceptar";
    private String Btn2 = "Cancelar";

    private Context context = null;
    private Activity myActivity = null;

    private static AlertMessages sSoleInstance = null;


    private AlertMessages(Activity activity, Context contextFull)
    {
        this.context=contextFull;
        this.myActivity=activity;
    }

    public static AlertMessages getInstance(Activity activity)
    {
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new AlertMessages(activity, activity);
        }
        return sSoleInstance;
    }


    public void ShowAlertMessage()
    {

    }


    //@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(myActivity);
        // Get the layout inflater
        LayoutInflater inflater = myActivity.getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_signin, null))
                // Add action buttons
                .setPositiveButton(R.string.signin, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //TODO: revisar como implementarlo
                        //LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }

    //----------------------------------------------------------------
    //----------------------------------------------------------------


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getBtn1() {
        return Btn1;
    }

    public void setBtn1(String btn1) {
        Btn1 = btn1;
    }

    public String getBtn2() {
        return Btn2;
    }

    public void setBtn2(String btn2) {
        Btn2 = btn2;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
