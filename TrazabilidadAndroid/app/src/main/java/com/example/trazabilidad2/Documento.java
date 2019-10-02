package com.example.trazabilidad2;

import android.media.Image;

public class Documento {
    private String nombre;
    private String tipo;
    private String estado;
    private String latitud;
    private String longitud;
    private String Descripcion;
    private Image imagenDoc;

    public Documento(String nombre, String tipo,Image imagenDoc) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenDoc = imagenDoc;
    }

    public Documento(String nombre, String tipo, String estado, String latitud, String longitud, String descripcion, Image imagenDoc) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.latitud = latitud;
        this.longitud = longitud;
        Descripcion = descripcion;
        this.imagenDoc = imagenDoc;
    }
    //private Abogado pri;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getDescripcion() {
        return Descripcion;
    }
}
