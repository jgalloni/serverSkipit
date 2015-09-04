package com.springapp.mvc;

import java.io.Serializable;

/**
 * Created by coco on 02/09/2015.
 */
public class Usuario implements Serializable {
    private String nombre;
    private String pass;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
