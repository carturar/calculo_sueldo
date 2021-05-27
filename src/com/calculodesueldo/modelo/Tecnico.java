
package com.calculodesueldo.modelo;

import java.io.Serializable;


public class Tecnico extends Empleado implements Serializable {
    private byte cantidad;
    private double bonificacion;
    
    public Tecnico(String cedula, String nombre, double sueldo) {
        super(cedula, nombre, sueldo);
       
            this.cantidad = cantidad;
            this.bonificacion = bonificacion;            
    }

    @Override
    public double calcularSueldo(double basico, double bonificacion, byte cantidadOrdenes) {
        return super.calcularSueldo(basico, cantidadOrdenes);
    }
    
    public byte cantidad(){
    return (byte) cantidad;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = (byte) cantidad;
    }
    public double bonificacion(){
        return bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
      
}
    

