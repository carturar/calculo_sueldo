
package com.calculodesueldo.modelo;

import java.io.Serializable;

public class Supervisor extends Empleado implements Serializable {
    
    public Supervisor(String cedula, String nombre, double sueldo) {
        super(cedula, nombre, sueldo);
    }

  
   
    @Override
    public double calcularSueldo(double basico, double bonificacion, byte cantidadOrdenes) {
       // cantidad ordenes de los tecnicos
       // sueldo a pagar
       if (cantidadOrdenes < 20)
       {  
        // bonificacion 8%
           setSueldo(getSueldo()+ getSueldo() * 0.08);
             return getSueldo();  
       }
       else
       {
           //bonificacion 4%
         setSueldo(getSueldo() + getSueldo()*0.04);
            return  getSueldo();  
       }
    }    
}