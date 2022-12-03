/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCircunferencia {
      public Circunferencia Crearcircu (){
     Scanner leer = new Scanner (System.in);
     System.out.println("ingrese el radio del circulo");
     double radio = leer.nextDouble();
     
  return new Circunferencia (radio) ;   
 }   
public Circunferencia perimetro (Circunferencia cs){
    System.out.println("el perimetro de su circulo es de "+ (2 * 3.14 * cs.getRadio()));
    
    
    
 return cs;   
}    

public Circunferencia area (Circunferencia cs){
    
    System.out.println("el area de su circulo es de "+ (3.14 * (cs.getRadio() * cs.getRadio())));
    
    return cs ;
}
}
