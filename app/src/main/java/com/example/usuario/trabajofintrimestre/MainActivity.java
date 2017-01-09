package com.example.usuario.trabajofintrimestre;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    FloatingActionButton fab1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/BEBAS___.TTF");
        TextView nombreText = (TextView) findViewById(R.id.txt_doctor);
        nombreText.setTypeface(miPropiaTypeFace);


        //implementacion fabMain
        fab1=(FloatingActionButton)findViewById(R.id.fab);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Mostrando informacion médica!!!!", Snackbar.LENGTH_LONG).show();
                Intent actividadDoctor = new Intent(MainActivity.this, activity_listView.class);
                startActivity(actividadDoctor);
            }
        });



    }


    }



