package com.example.usuario.trabajofintrimestre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class activity_listView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);
        ListView listado = (ListView) findViewById(R.id.mListView);
        MiAdapter adapta = new MiAdapter();

        adapta.films.add(new Pelicula(R.drawable.salcichas,"La fiesta de las salchichas", "La película sigue a una salchicha y sus nuevos amigos, en un viaje que les llevará desde el supermercado hasta sus hogares.",false,false));
        adapta.films.add(new Pelicula(R.drawable.starwars,"Star Wars", "Una película dirigida por J.J. Abrams con Daisy Ridley, John Boyega, Adam Driver, Harrison Ford. Han pasado más de treinta años desde la caída del Imperio",false,false));
        adapta.films.add(new Pelicula(R.drawable.torrente,"El brazo tonto de la ley", "Torrente, el brazo tonto de la ley es una película española dirigida por Santiago Segura, escrita y protagonizada por él mismo, y producida por Lolafilms",false,false));
        adapta.films.add(new Pelicula(R.drawable.hormigas,"Hormigas", "Hormigas, cuyo nombre original en inglés es “Antz”, es una película animada infantil de aventura dirigida por Eric Darnell y Tim Johnson.",false,false));
        adapta.films.add(new Pelicula(R.drawable.abuela,"Esta abuela es un peligro 2", "Dirigida por Raja Gosnell (Solo en casa 3), Esta abuela es un peligro está protagonizada por Martin Lawrence, Nia Long, Paul Giamatii, Jascha Washington",false,false));
        adapta.films.add(new Pelicula(R.drawable.nemo,"Buscando a nemo", "Buscando a Nemo es una película infantil de animación producida por la compañía Pixar Animation Studios y ganadora de un premio Óscar.",false,false));
        adapta.films.add(new Pelicula(R.drawable.cr7,"The wordl at his feel", "Documental que persigue la figura del futbolista portugués en su intimidad desde ser un joven soñador de la isla de Madeira hasta convertirse en el líder del Real Madrid y la selección portuguesa.",false,false));



        listado.setAdapter(adapta);


    }
}



