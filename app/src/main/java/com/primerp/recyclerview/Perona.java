package com.primerp.recyclerview;

import android.content.Intent;

public class Perona {
    private String Nombre;
    protected String Telefono;
    private Intent accion;
    public Perona(String nombre, String telefono) {
        Nombre = nombre;
        Telefono = telefono;
    }
    public Perona(String nombre, String telefono, Intent accion) {
        Nombre = nombre;
        Telefono = telefono;
        this.accion = accion;
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
    public Intent getAccion() {
        return accion;
    }
    public void setAccion(Intent accion) {
        this.accion = accion;
    }
    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Telefono: " + Telefono;
    }


}
