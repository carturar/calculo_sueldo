
package com.calculodesueldo.modelo;

import java.io.Serializable;


public class CodigoCargo implements Serializable {
     private byte codigo;
     private String descripcion; 

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
        return "CodigoCargo\n{" + "codigo: " + codigo + ", descripcion: " + descripcion;
    }
     
    
public CodigoCargo(byte codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
}


}


