package com.example.usuario.trabajofintrimestre;

/**
 * Created by usuario on 30/11/16.
 */

public class Doctores {

        private String Texto;
        private String nombre;



        public Doctores() {
        }

        public Doctores(String im, String c1){
            Texto=im;
            nombre=c1;


        }

        public String getNombre() {

            return nombre;
        }

        public void setNombre(String titulo) {

            this.nombre = nombre;
        }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
}

