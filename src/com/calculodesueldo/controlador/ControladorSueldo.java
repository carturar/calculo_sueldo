
package com.calculodesueldo.controlador;

import com.calculodesueldo.modelo.Empleado;
import com.calculodesueldo.modelo.Supervisor;
import com.calculodesueldo.modelo.Tecnico;


public class ControladorSueldo {
   public static final int NUMERO_EMPLEADOS = 6;
   public static  final double BONIFICACION = 0.05*BASICO;
    private static double BASICO;
   private Empleado[] empleados;
   private int contEmpleados=0;
    public Tecnico adicionarEmpleado;

    public ControladorSueldo() {
        empleados= new Empleado[NUMERO_EMPLEADOS];
        ///
        //Leyera mis empleados de un archivo plano
        inicializarEmpleados();
    }
    
    private void inicializarEmpleados()
    {
        empleados[0]= new Tecnico ("11111111", "Carlos Arias", (double) 1800000 );
                    
               contEmpleados++;
    }
    
    public String adicionarEmpleado(Empleado emp)
    {
        //Como hago yo para saber en que posición lo 
        // debo agregar
        if(contEmpleados<NUMERO_EMPLEADOS)
        {
            //LO puedo adicionar
            empleados[contEmpleados]=emp;
            contEmpleados++;
            return "Empleado agregado";
        }
        else
        {
            return "No puede agregar más empleados";
        }
        
    }
    
    public double calculodeSueldo()
    {
        ///Sumar los sueldos empleados
        // Recorrer los empleados
        // calcular el sueldo
       
        double sumaSueldo = 0;
        /// Tengo el total de ordenesde los tecnicos
        double totalcantidadOrdenesTecnicos = this.totalcantidadOrdenesTecnicos();
        for(Empleado emp : this.empleados)
        {
            double sueldoCalculado = 0;
            if( emp instanceof Tecnico)
            {
                
                sueldoCalculado = emp.calcularSueldo (((Tecnico) emp).getCantidad(),  BONIFICACION);
            }
            //Calculo del supervisor
            // Suman cantidad de todos los tecnicos
           else
            {
               sueldoCalculado = emp.getSueldo(totalcantidadOrdenesTecnicos(), emp.getSueldo());
            }
             sumaSueldo = sumaSueldo + sueldoCalculado;
           
            
        }
        return sumaSueldo;
    }
    
    public double totalcantidadOrdenesTecnicos()
    {
        int totalcantidadOrdenesTecnicos = 0;
        for(Empleado emp: this.empleados)
        {
            if( emp instanceof Tecnico)
            {
                totalcantidadOrdenesTecnicos = (int) (totalcantidadOrdenesTecnicos + 
                        ((Tecnico) emp).getCantidad());
            }
        }
        return totalcantidadOrdenesTecnicos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }
    
    
    
}