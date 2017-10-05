package com.iliuminate.myfreebabyshop;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.iliuminate.myfreebabyshop.Activities.ItemListActivity;
import com.iliuminate.myfreebabyshop.Common.AlertMessages;
import com.iliuminate.myfreebabyshop.Intefaces.BaseActivity;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BaseActivity {


    //Declaracion de Variables
    private Button btnTest;
    private AlertMessages alertMessages;

    //@BindView(R.id.btnTest) Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        InitReferencesComponents();

        AddClickListeners();

        ImplementMessages(MainActivity.this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent i = new Intent(MainActivity.this, ItemListActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------

    @Override
    public void InitReferencesComponents() {
        //Instanciamos los diferentes componentes
        btnTest = (Button)findViewById(R.id.btnTest);
    }

    @Override
    public void AddClickListeners() {
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callDialogMessages();
            }
        });

        //Others...
    }

    @Override
    public void ImplementMessages(Activity activity) {
        alertMessages = AlertMessages.getInstance(activity);
    }


    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------

    private void logicaMain()
    {
        //Aqui mi logica
        Log.e("TAG1","MI logica aceptar");
        Toast.makeText(this, "Local Main Aceptar", Toast.LENGTH_SHORT).show();
    }

    private void logicaCalcular()
    {
        //Aqui mi logica
        Log.e("TAG1","MI logica calcular");
        Toast.makeText(this, "Logical Cancelar", Toast.LENGTH_SHORT).show();
    }

    /**
     * Muestra en pantalla un mensaje personalizado de prueba
     */
    private void callDialogMessages()
    {
//        (alertMessages.onCreateDialog(Bundle.EMPTY)).show();

//        alertMessages.setAceptar(logicaMain());

        final Dialog d = (alertMessages.onCreateDialogPersonal());
        //d.show();
//        ((Button)d.findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                d.dismiss();
//            }
//        });


        (alertMessages.getBtnAceptar()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logicaMain();
            }
        });


        (alertMessages.getBtnCancelar()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logicaCalcular();
            }
        });

    }
}
