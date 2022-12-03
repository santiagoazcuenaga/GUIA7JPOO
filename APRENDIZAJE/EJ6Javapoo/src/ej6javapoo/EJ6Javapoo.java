/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6javapoo;

import entidad.Cadena;
import java.util.Scanner;
import servicio.ServicioCadena;

/**
 *
 * @author Usuario
 */
public class EJ6Javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner leer = new Scanner (System.in);
       ServicioCadena b2 = new ServicioCadena();
       Cadena b1 = b2.crearobjeto();
      b2.mostrarvocales(b1);
       b2.invertirFrase(b1);
    }
    
}
