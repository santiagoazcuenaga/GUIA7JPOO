/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4javapoo;

import entidad.Rectangulo;
import servicio.ServicioRectangulo;

/**
 *
 * @author Usuario
 */
public class EJ4Javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioRectangulo b2 = new ServicioRectangulo();
        Rectangulo b1 = b2.pedirdatos();
        b2.superficie(b1);
        b2.perimetro(b1);
        b2.grafico(b1);
    }
    
}
