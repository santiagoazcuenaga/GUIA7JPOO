/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3javapoo;

import entidad.Operacion;
import servicio.ServicioOperacion;

/**
 *
 * @author Usuario
 */
public class EJ3Javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  ServicioOperacion b2= new ServicioOperacion();
       Operacion b1 = b2.pedirDatos();
       b2.sumar(b1);
       b2.resta(b1);
       b2.multiplicar(b1);
       b2.dividir(b1);
    }
    
}
