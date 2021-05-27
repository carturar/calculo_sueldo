
package com.calculodesueldo;

import com.calculodesueldo.controlador.ControladorSueldo;
import com.calculodesueldo.modelo.Supervisor;
import com.calculodesueldo.modelo.Tecnico;



public class CalculodeSueldo {

   
    public static void main(String[] args) {
        // TODO code application logic here
       /*Calcular de bonificacion sobre el sueldo por ordenes finalizadas para 5 tecnicos y un supervisor

El trabajo constara de cuantas ordenes hace un tecnico por turno
cada orden finalizada tiene un valor de 5% del sueldo basico 
teniendo en cuenta que los sueldos van por categoria 
el tecnico de 4 años en adelante de antiguedad tiene un basico de 1.800.000
el tecnico de 1 a  3 años tiene un suelod de 1.000.000
y los tenicos con menor de un año 900.000
y el supervisor gana un basico de 2.200.000 y una bonificacion de 8% si los tecnicos hacen mas de 20 ordenes a la semana
y 4% si se hacen menos de 20  */
       
        ControladorSueldo control = new ControladorSueldo();
        control.adicionarEmpleado = new Tecnico("11111111", "carlos Arias", (double)1800000);
        control.adicionarEmpleado = new Tecnico("22222222", "JairoSanchez", (double)1000000);
        control.adicionarEmpleado = new Tecnico("33333333", "alexander Gomez",(double)900000);
        control.adicionarEmpleado = new Tecnico("44444444", "Gabriel Carvajal", (double)1800000);
        control.adicionarEmpleado = new Tecnico("66666666", "Orlando Henao",(double) 1000000);
        control.adicionarEmpleado = new Supervisor("55555555", "Juan David Correa",(double) 2200000);
        
        System.err.println("control = " + control.calculodeSueldo());
    
    }
}
