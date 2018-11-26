package com.iesvirgendelcarmen.dam.materialdesign05;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Material05 extends AppCompatActivity {

    Toolbar toolbar;
    CoordinatorLayout coordinador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material05);

        coordinador = findViewById(R.id.coordinador);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void mensaje(int resid){
        Snackbar snackbar = Snackbar.make(coordinador,getText(resid), Snackbar.LENGTH_LONG);
        snackbar.show();
       // Toast.makeText(this, getText(resid), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.barra_nuevo: mensaje(R.string.cadena_barra_nuevo);
                return true;
            case R.id.barra_editar: mensaje(R.string.cadena_barra_editar);
                return true;
            case R.id.barra_configurar : mensaje(R.string.cadena_barra_configurar);
                return true;
            case R.id.barra_ayuda: mensaje(R.string.cadena_barra_ayuda);
                return true;
            case R.id.barra_acerca: mensaje(R.string.cadena_barra_acerca);
                return true;
            default: return false;
        }

    }
}
