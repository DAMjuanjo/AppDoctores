package com.example.usuario.trabajofintrimestre;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by usuario on 30/11/16.
 */

public  class MiAdapter extends ArrayAdapter<Doctores> {


    public MiAdapter(Activity context, ArrayList<Doctores>doctores){
        super(context, 0, doctores);
    }

    @NonNull
    @Override
    public View getView(int position, View vista, ViewGroup vistagrupo) {//devuelve el view
        if(vista==null){
            vista= LayoutInflater.from(getContext()).inflate(R.layout.esqueleto, vistagrupo, false);
        }

        Doctores currentAndroidFlavor = getItem(position);

        TextView nombre=(TextView) vista.findViewById(R.id.txt_nombre);
        nombre.setText(currentAndroidFlavor.getNombre());


        TextView texto=(TextView) vista.findViewById(R.id.display);
        texto.setText(currentAndroidFlavor.getTexto());



        return vista;
    }
}