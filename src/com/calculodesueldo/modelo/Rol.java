
package com.calculodesueldo.modelo;

import java.io.Serializable;

public class Rol implements Serializable {
     private byte codigo;
    private String descripcion;
    
    public Rol(byte codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Cargo{" + "codigo=" + codigo + ", "
                + "descripcion=" + descripcion + '}';
    }
}
