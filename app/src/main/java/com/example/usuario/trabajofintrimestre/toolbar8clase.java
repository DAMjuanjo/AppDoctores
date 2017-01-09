package com.example.usuario.trabajofintrimestre;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.view.View;


/**
 * Created by juanjo on 07/12/2016.
 */

public class toolbar8clase extends AppCompatActivity{
    FloatingActionButton fab_otorrinolaringologo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar8);

        fab_otorrinolaringologo=(FloatingActionButton)findViewById(R.id.fab_otorrinolaringologo);
        fab_otorrinolaringologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Volviendo a pagina principal!!!!", Snackbar.LENGTH_LONG).show();
                Intent actividadDoctor = new Intent(toolbar8clase.this, MainActivity.class);
                startActivity(actividadDoctor);
            }
        });

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.ctLayout_8);

        collapsingToolbar.setTitle("Otorrino");



    }

}