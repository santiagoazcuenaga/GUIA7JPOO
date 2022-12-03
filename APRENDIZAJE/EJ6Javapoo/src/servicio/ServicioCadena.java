/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCadena {
        static Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Cadena crearobjeto(){
      
        System.out.println("ingresar la cadena de caracteres");
        String frase = leer.next();
       int longitud = frase.length();
        System.out.println("su frase es "+frase+ " su longitud es "+ longitud);
        
     return new Cadena(frase,longitud);   
    }
        
   public Cadena mostrarvocales(Cadena cs){
       int cont = 0;
       
       for (int i = 0; i < cs.getLongitud(); i++) {
          if (cs.getFrase().substring(i, i+1).equals("a")) {
               cont++;
           }
           if(cs.getFrase().substring(i, i+1).equals("e")){
               cont++;
           } 
             if(cs.getFrase().substring(i, i+1).equals("i")){
               cont++;
           } 
               if(cs.getFrase().substring(i, i+1).equals("o")){
               cont++;
           } 
                 if(cs.getFrase().substring(i, i+1).equals("u")){
               cont++;
           } 
       }
       System.out.println("la cantidad de vocales encontradas es "+cont);
           
   return cs;    
   }     
   public void invertirFrase (Cadena cs){
       
       int e = cs.getLongitud();
    for (int i = cs.getLongitud()-1; i >= 0; i--) {
            System.out.print(cs.getFrase().charAt(i));
        }
        System.out.println(" ");
    }
      
//for (int i = 0; i < e+1; i++) {
          
           
         //  System.out.print(cs.getFrase().substring(e-i,i-1));   
           
           
    
    
}
