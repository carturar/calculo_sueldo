
package com.calculodesueldo.modelo;

import java.io.Serializable;


public class Empleado implements Serializable {
    private String cedula;
    private String nombre;
    private double sueldo;
    private double bonificacion;
    
    public Empleado (String cedula, String nombre, double sueldo){
         this.cedula = cedula;
         this.nombre = nombre ;
         this.sueldo = sueldo;
         this.bonificacion = bonificacion;
                         
    }

   
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
      public double getBonificacion(){
          return bonificacion;
      }     
      public void setBonificacion (double bonificacion){
          this.bonificacion = bonificacion;
      }
    public double calcularSueldo (double basico, double bonificacion, byte cantidadOrdenes)
    {
        
        sueldo = bonificacion + (sueldo*cantidadOrdenes);
        return sueldo;
     
    }       

    public double calcularSueldo(double sueldo, double BONIFICACION) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSueldo(double bonificacion, double sueldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
