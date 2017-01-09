package com.example.usuario.trabajofintrimestre;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_listView extends AppCompatActivity{

    FloatingActionButton fab2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/BEBAS___.TTF");
        TextView nombreText2 = (TextView) findViewById(R.id.txt_lista);
        nombreText2.setTypeface(miPropiaTypeFace);


        final ArrayList<Doctores> doctores = new ArrayList<>();


        doctores.add(new Doctores("U", "Médico especialista en Urología."));
        doctores.add(new Doctores("O","Médico especialista en Oftalmología"));
        doctores.add(new Doctores("P","Médico especialista en Psicología"));
        doctores.add(new Doctores("O","Médico especialista en Odontología"));
        doctores.add(new Doctores("T","Médico especialista en Traumatología"));
        doctores.add(new Doctores("P","Médico especialista en Psiquiatría"));
        doctores.add(new Doctores("F","Médico especialista en Fisioterapia"));
        doctores.add(new Doctores("O","Médico especialista en otorrinolaringología"));
        doctores.add(new Doctores("N","Médico especialista en nutrición, dietética y alimentación"));
        doctores.add(new Doctores("G","Médico especialista en Ginecología"));


        MiAdapter adapter = new MiAdapter(this, doctores);

        final ListView listView = (ListView) findViewById(R.id.mListView);

        listView.setAdapter(adapter);

        //implementacion fabMedico
        fab2=(FloatingActionButton)findViewById(R.id.fab_medicosXml);
        fab2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Snackbar.make(v, "Mostrando tipos de doctores!!!!", Snackbar.LENGTH_LONG).show();
              Intent actividadDoctor = new Intent(activity_listView.this, medicos.class);
               startActivity(actividadDoctor);
            }
        });



    }
}






