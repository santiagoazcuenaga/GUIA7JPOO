/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioRectangulo {
    static Scanner leer = new Scanner (System.in);   
    public Rectangulo pedirdatos(){
        System.out.println("ingrese la base");
        int base = leer.nextInt();
        System.out.println("ingrese la altura");
        int altura = leer.nextInt();
        
        
        
        
        
     return new Rectangulo(base,altura);   
    }
    
    public Rectangulo superficie (Rectangulo cs){
        System.out.println("la superficie de su rectangulo es "+ (cs.getBase() * cs.getAltura())); 
        
        
        
        
     return cs;   
    }
    public Rectangulo perimetro (Rectangulo cs){
        System.out.println("el perimetro del rectangulo es "+(cs.getBase()+cs.getAltura()) * 2); 
        
        
        
   return cs;     
    }
public Rectangulo grafico (Rectangulo cs){
    for (int i = 0; i < cs.getBase(); i++) {
        for (int j = 0; j < cs.getAltura(); j++) {
            if (i == 0 || i == cs.getBase() -1 || j == 0 || j == cs.getAltura() -1 ){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    
    
 return cs;   
}    
}
