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

public class toolbar7clase extends AppCompatActivity{
    FloatingActionButton fab_fisioterapeuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar7);

        fab_fisioterapeuta=(FloatingActionButton)findViewById(R.id.fab_fisioterapeuta);
        fab_fisioterapeuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Volviendo a pagina principal!!!!", Snackbar.LENGTH_LONG).show();
                Intent actividadDoctor = new Intent(toolbar7clase.this, MainActivity.class);
                startActivity(actividadDoctor);
            }
        });

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.ctLayout_7);

        collapsingToolbar.setTitle("Fisioterapeuta");

    }

}