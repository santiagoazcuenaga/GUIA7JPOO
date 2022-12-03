/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCuenta {
    static Scanner leer = new Scanner (System.in); 
    public Cuenta pedirdatos(){
       
        System.out.println("Ingrese por favor el numero de cuenta");
        double numeroCuenta = leer.nextDouble();
        System.out.println("Ingrese por favor su DNI");
        long Dni = leer.nextLong();
        System.out.println("Ingrese por favor su saldo actual");
        double saldoActual = leer.nextDouble();
        
        
      return new Cuenta(numeroCuenta,Dni,saldoActual);  
    }
    
    public Cuenta pedirdinero(Cuenta cs){
       double sumaSaldo;
        System.out.println("ingrese un deposito que quiera realizar ");
        sumaSaldo = leer.nextDouble();
        double resultado=sumaSaldo + cs.getSaldoActual();
        System.out.println("Ahora dispone de "+resultado+ " Ars en su cuenta" );
       cs.setSaldoActual(resultado);
        
     return cs;   
    }
    public Cuenta ingresar(Cuenta cs){
         System.out.println("ingrese cuanto quiere retirar");
         double retirar = leer.nextDouble();
         double resultado = cs.getSaldoActual() - retirar;
         System.out.println("se han retirado "+retirar+ " y le han quedado "+resultado+" en tu cuenta");
        if (retirar > cs.getSaldoActual()){
            System.out.println("no dispone del saldo suficiente");
        }
     return cs;   
    }
public Cuenta extraccionrapida (Cuenta cs ){
    System.out.println("ingrese cuanto quiere retirar, solo hasta el 20%");
    double extraccion = leer.nextDouble();
    
   while(cs.getSaldoActual() * 0.20 < extraccion){
       System.out.println("Se pasó del limite,intentelo nuevamente");
       extraccion = leer.nextDouble();
   }

    return cs;
}    
  public Cuenta consultarsaldo (Cuenta cs){
    
      System.out.println("¿Desea saber su saldo actual? S/N");
   String resp = leer.next();
   if( resp.equals("S")){
       System.out.println(cs.getSaldoActual());
   }else{
       System.out.println("ADIOS");
   }
      
      
   return cs;   
  } 
  public Cuenta consultardatos (Cuenta cs){
     System.out.println("¿Desea saber los datos de su cuenta? S/N");
   String resp2 = leer.next();
   if( resp2.equals("S")){
       System.out.println(cs.getSaldoActual());
       System.out.println(cs.getDni());
       System.out.println(cs.getNumeroCuenta());
   }else{
       System.out.println("ADIOS"); 
   }  
   return cs;   
  }
}
