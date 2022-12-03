/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioOperacion {
    public Operacion pedirDatos(){
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese un valor para num 1");
      int num1 = leer.nextInt();
      System.out.println("Ingrese un valor para num2");
      int num2= leer.nextInt();
      
      return new Operacion (num1,num2);
      
      
  }
  
  public Operacion sumar(Operacion cs){
      System.out.println("la suma es "+ (cs.getNum1() + cs.getNum2()) );   
      
      
      
  return cs;    
  }
  public Operacion resta (Operacion cs){
      System.out.println("La resta es "+ (cs.getNum1() - cs.getNum2() ));
      
      
      
      return cs;
  }
  public Operacion multiplicar (Operacion cs){
     int multi = cs.getNum1() * cs.getNum2();
      if (multi == 0){
          System.out.println("ERROR : 0");
      }else{
          System.out.println(""+multi+"");
      }  
      
      
      
  return cs;    
  }
  
public Operacion dividir (Operacion cs){
    int divi = cs.getNum1() / cs.getNum2();
      if (divi == 0){
          System.out.println("ERROR : 0");
      }else{
          System.out.println(""+divi+"");
      }  
    
    
return cs;    
}  

}
