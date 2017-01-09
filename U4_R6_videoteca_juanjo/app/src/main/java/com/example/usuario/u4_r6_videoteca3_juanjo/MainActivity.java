package com.example.usuario.trabajofintrimestre;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1=(Button)findViewById(R.id.btn_ver);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent peliculasIntents= new Intent(MainActivity.this,activity_listView.class);
                startActivity(peliculasIntents);
            }
        });

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "Fonts/BEBAS___.TTF");

        TextView helloPoker = (TextView) findViewById(R.id.txt_peliculas);

        helloPoker.setTypeface(miPropiaTypeFace);
    }
}
