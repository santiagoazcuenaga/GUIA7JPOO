/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10javapoo;

import entidad.Arreglos;
import java.util.Arrays;
import servicios.ServicioArreglos;

/**
 *
 * @author Usuario
 */
public class EJ10Javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Arreglos cs = new Arreglos ();
       ServicioArreglos b2= new ServicioArreglos();
        b2.primerArreglo(cs.getNum1());
        System.out.println(Arrays.toString(cs.getNum1()));
      b2.menorAMayor(cs.getNum1());
        System.out.println(Arrays.toString(cs.getNum1()));
     b2.segundoArreglo(cs.getNum2(),cs.getNum1());
        System.out.println(Arrays.toString(cs.getNum2())); 
    }
    
}
