/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

/**
 *
 * @author brandonmichaelwebb
 */
public class Book {
   private int id;
   private String title;
   private String genre;
   private Author author;
 
   public Book() {}
   public Book(String title, String genre, Author author ) {
      this.title = title;
      this.genre = genre;
      this.author = author;
   }
   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
 
    public Author getAuthor() {
        return author;
    }
 
    public void setAuthor(Author author) {
        this.author = author;
    }
 
    public String getGenre() {
        return genre;
    }
 
    public void setGenre(String genre) {
        this.genre = genre;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    } 
}
