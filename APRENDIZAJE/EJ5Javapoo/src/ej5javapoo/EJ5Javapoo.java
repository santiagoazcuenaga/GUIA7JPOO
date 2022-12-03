/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5javapoo;

import entidad.Cuenta;
import servicio.ServicioCuenta;

/**
 *
 * @author Usuario
 */
public class EJ5Javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ServicioCuenta b2 = new ServicioCuenta();
        Cuenta b1 = b2.pedirdatos();
        b2.pedirdinero(b1);
        b2.ingresar(b1);
        b2.extraccionrapida(b1);
        b2.consultarsaldo(b1);
        b2.consultardatos(b1);
    }
    
}
