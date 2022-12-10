/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextraextran1;

import entidad.Fracciones;
import servicios.ServicioFracciones;

/**
 *
 * @author Usuario
 */
public class EJEXTRAEXTRAN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Fracciones b1 = new Fracciones ();
   ServicioFracciones b2= new ServicioFracciones ();
  b2.pedirdatos(b1);
   b2.sumar(b1);
   b2.restar(b1);
   b2.multiplicar(b1);
   b2.dividir(b1);
    }
    
}
