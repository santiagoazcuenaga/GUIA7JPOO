/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
  public int Numeropaginas;
  
  public Libro() {
    }
  
  
  
  
    public Libro(int ISBN, String titulo, String autor, int Numeropaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.Numeropaginas = Numeropaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return Numeropaginas;
    }

    public void setNumeropaginas(int Numeropaginas) {
        this.Numeropaginas = Numeropaginas;
    }
}
