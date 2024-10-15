package com.primerp.recyclerview;

import android.content.Intent;
import android.graphics.Color;

public class Perona {
    private String Nombre;
    protected String Telefono;
    private Color Color;
    private int imageResId;  // ID del recurso de la imagen
    private Intent accion;
    public Perona(String nombre, String telefono,int imageResId) {
        Nombre = nombre;
        Telefono = telefono;
        Color= Color;
        this.imageResId = imageResId;

    }
    public Perona(String nombre, String telefono,Color color, Intent accion,int imageResId) {
        Nombre = nombre;
        Telefono = telefono;
        Color=color;
        this.accion = accion;
        this.imageResId = imageResId;

    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public Color getColor() {
return Color;
    }
    public void setColor(Color color) {Color=color;}
    public Intent getAccion() {
        return accion;
    }
    public void setAccion(Intent accion) {
        this.accion = accion;
    }
    public int getImageResId() {
        return imageResId;
    }
    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Telefono: " + Telefono;
    }


}
