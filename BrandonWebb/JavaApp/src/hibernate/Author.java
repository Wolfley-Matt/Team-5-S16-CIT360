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
public class Author {
   private int id;
   private String name;
   private int age;
 
   public Author() {}
 
   public Author(String name, int age) {
        this.name = name;
        this.age = age;
   }
 
   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setAge(int age) {
        this.age = age;
    } 
}
