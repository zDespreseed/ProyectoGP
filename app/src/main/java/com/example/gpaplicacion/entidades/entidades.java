package com.example.gpaplicacion.entidades;

import java.io.Serializable;


public class entidades implements Serializable {
    private int imgFoto;
    private String titulo;
    private int sonido;

    public entidades(int imgFoto, String titulo, int sonido) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.sonido = sonido;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getSonido() {
        return sonido;
    }

}
