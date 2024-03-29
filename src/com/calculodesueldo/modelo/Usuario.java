
package com.calculodesueldo.modelo;

import java.io.Serializable;


    public class Usuario implements Serializable {
    private String correo;
    private String contrasenia;
    private Rol rol;
    private String nombre;

    public Usuario(String correo, String contrasenia, Rol rol, String nombre) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.nombre = nombre;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", contrasenia=" + contrasenia + ", rol=" + rol + ", nombre=" + nombre + '}';
    }  
}    
 