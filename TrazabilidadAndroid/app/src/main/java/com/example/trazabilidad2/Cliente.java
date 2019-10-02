package com.example.trazabilidad2;

public class Cliente {
    private String ID;
    private String Nombre;
    private String latitud;
    private String longitud;
    private String Numtel;
    private String Direccion;
    private String correoElectronico;

    //private Repartidor Repartidor;

    private String fotografia;


    public Cliente(String ID, String nombre, String latitud, String longitud, String numtel, String direccion, String correoElectronico, String fotografia) {
        this.ID = ID;
        this.Nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.Numtel = numtel;
        this.Direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.fotografia = fotografia;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getNumtel() {
        return Numtel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setNumtel(String numtel) {
        Numtel = numtel;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    //Cliente normal sin pedir
    public Cliente(){}
}
