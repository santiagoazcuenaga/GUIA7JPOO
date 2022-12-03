/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class ServicioArreglos {
      public void primerArreglo(double[] cs ){
        
        
        
        for (int i = 0; i < 50; i++) {
        cs[i] =  (Math.random()*100);
        }
       
    
    
    } 
   public void menorAMayor(double [] cs){
   Arrays.sort(cs);
   
       
       
   }
   public void segundoArreglo (double [] cs, double[] a){
    
       for (int i = 0; i < 10; i++) {
        cs[i] = a[i];
        
        }Arrays.fill(cs, 10, 20, 0.5);
    
    
    
    
 
}
}