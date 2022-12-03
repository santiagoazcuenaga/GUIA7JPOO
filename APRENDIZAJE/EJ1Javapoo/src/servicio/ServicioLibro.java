/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioLibro {
      public Libro pedirdatos(){
    Scanner leer = new Scanner (System.in);

     System.out.println("ingrese el titulo del libro");
  String Titulo = leer.nextLine();
     System.out.println("ingrese el autor del libro");
  String Autor = leer.nextLine();
     System.out.println("ingrese el ISBN");
     int ISBN = leer.nextInt();
     System.out.println("ingrese la cantidad de paginas");
     int Numeropaginas = leer.nextInt();
    
     

  return new Libro(ISBN, Titulo, Autor, Numeropaginas);
}
 
public Libro dardatos(Libro cs){ 
  
      Scanner leer = new Scanner (System.in);
    System.out.println("el titulo del libro es  "+cs.getTitulo());
     System.out.println("el autor del libro es  "+cs.getAutor());
     System.out.println("el ISBN es "+cs.getISBN());
     System.out.println(" la cantidad de paginas es  "+cs.getNumeropaginas());
     
     
     
 return cs ;

}
}