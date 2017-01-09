package com.example.usuario.trabajofintrimestre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;


/**
 * Created by usuario on 30/11/16.
 */

public class MiAdapter extends BaseAdapter {

    public ArrayList<Pelicula> films;
    public MiAdapter(){
        this.films=new ArrayList<Pelicula>();
    }


    @Override
    public int getCount() {//cantidad de elementos
        return films.size();
    }

    @Override
    public Object getItem(int position) {//te devuelve el elementos segun la posicion
        return films.get(position);
    }

    @Override
    public long getItemId(int position) {//te devuelve el id segun la posicion
        return position;
    }

    @Override
    public View getView(int position, View vista, ViewGroup vistagrupo) {//devuelve el view
        if(vista==null){
            Context cnt=vistagrupo.getContext();
            vista= LayoutInflater.from(cnt).inflate(R.layout.esqueleto,null);
        }

        Pelicula mpeli=films.get(position);
        EditText titulo=(EditText) vista.findViewById(R.id.et_nombre);
        EditText desc=(EditText)vista.findViewById(R.id.et_descricion);

        CheckBox version=(CheckBox)vista.findViewById(R.id.ck_version);
        CheckBox subtitulo=(CheckBox)vista.findViewById(R.id.ck_subt);
        ImageView imagen=(ImageView)vista.findViewById(R.id.ima_1);


        titulo.setText(mpeli.getTitulo());
        desc.setText(mpeli.getDescripcion());
        version.setChecked(mpeli.isVersion());
        subtitulo.setChecked(mpeli.isSubtitulos());
        imagen.setImageResource(mpeli.getImagen());



        return vista;
    }
}