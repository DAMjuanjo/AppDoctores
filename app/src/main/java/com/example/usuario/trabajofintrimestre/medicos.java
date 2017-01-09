package com.example.usuario.trabajofintrimestre;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by juanjo on 08/12/2016.
 */

public class medicos extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicos);

        //implementacion de los textView de medicos

        TextView urologo = (TextView)findViewById(R.id.txt_urologo);
        TextView oftalmologo = (TextView)findViewById(R.id.txt_oftalmologo);
        TextView psicologo = (TextView)findViewById(R.id.txt_psicologo);
        TextView dentista = (TextView)findViewById(R.id.txt_dentista);
        TextView traumatologo = (TextView)findViewById(R.id.txt_traumatolgo);
        TextView psiquiatra = (TextView)findViewById(R.id.txt_psiquiatra);
        TextView fisioterapeuta = (TextView)findViewById(R.id.txt_fisioterapeuta);
        TextView otorrinolaringologo = (TextView)findViewById(R.id.txt_otorrinolaringologo);
        TextView nutricionista = (TextView)findViewById(R.id.txt_nutricionista);
        TextView ginecologo = (TextView)findViewById(R.id.txt_ginecologo);

        urologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno= new Intent(medicos.this,toolbar1clase.class);
                startActivity(uno);
            }
        });

        oftalmologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dos= new Intent(medicos.this,toolbar2clase.class);
                startActivity(dos);
            }

        });

        psicologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tres= new Intent(medicos.this,toolbar3clase.class);
                startActivity(tres);
            }
        });

        dentista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cuatro= new Intent(medicos.this,toolbar4clase.class);
                startActivity(cuatro);
            }
        });

        traumatologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cinco= new Intent(medicos.this,toolbar5clase.class);
                startActivity(cinco);
            }
        });

        psiquiatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seis= new Intent(medicos.this,toolbar6clase.class);
                startActivity(seis);
            }
        });
        fisioterapeuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siete= new Intent(medicos.this,toolbar7clase.class);
                startActivity(siete);
            }
        });

        otorrinolaringologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ocho= new Intent(medicos.this,toolbar8clase.class);
                startActivity(ocho);
            }
        });

        nutricionista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nueve= new Intent(medicos.this,toolbar9clase.class);
                startActivity(nueve);
            }
        });

        ginecologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diez= new Intent(medicos.this,toolbar10clase.class);
                startActivity(diez);
            }
        });


    }
}
