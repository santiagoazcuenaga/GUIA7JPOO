/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extra;

import Servicio.ServicioMeses;
import entidad.Meses;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class EJERCICIO5EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioMeses b2 = new ServicioMeses();
       Meses b1 = new Meses();
       b2.llenarMeses(b1);
        System.out.println(Arrays.toString(b1.getMeses()));
        System.out.println(b1.getMesSecreto());
       b2.esCorrecto(b1);
      
    }
    
}
