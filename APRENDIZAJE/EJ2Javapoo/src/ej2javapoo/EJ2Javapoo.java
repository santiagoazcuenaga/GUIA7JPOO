/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2javapoo;

import entidad.Circunferencia;
import servicio.ServicioCircunferencia;

/**
 *
 * @author Usuario
 */
public class EJ2Javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
 ServicioCircunferencia b2 = new ServicioCircunferencia();
       Circunferencia b1 = b2.Crearcircu();
       b2.perimetro(b1);
       b2.area(b1);

    }
    
}
