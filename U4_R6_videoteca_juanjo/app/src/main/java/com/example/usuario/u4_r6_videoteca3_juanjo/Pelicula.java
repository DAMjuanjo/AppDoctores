package com.example.usuario.trabajofintrimestre;

/**
 * Created by usuario on 30/11/16.
 */

public class Pelicula {

        int imagen;
        private String titulo;
        private String descripcion;
        boolean version;
        boolean subtitulos;

        public Pelicula() {
        }

        public Pelicula(int im, String c1, String c2, boolean ver, boolean sub){
            imagen=im;
            titulo=c1;
            descripcion=c2;
            version=ver;
            subtitulos=sub;

        }

        public String getTitulo() {

            return titulo;
        }

        public void setTitulo(String titulo) {

            this.titulo = titulo;
        }

        public String getDescripcion() {

            return descripcion;
        }

        public void setDescripcion(String descripcion){

            this.descripcion = descripcion;
        }

        public boolean isVersion()
        {
             return version;
        }

        public boolean isSubtitulos() {

            return subtitulos;
    }

    public int getImagen() {
        return imagen;
    }
}

