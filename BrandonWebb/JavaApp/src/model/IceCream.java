    package model;


// Generated Jun 20, 2016 6:03:20 PM by Hibernate Tools 4.3.1



/**
 * IceCream generated by bmwebb1
 */
public class IceCream  implements java.io.Serializable {


     private Integer id;
     private String flavor;
     private String color;

    public IceCream() {
    }

    public IceCream(String flavor, String color) {
       this.flavor = flavor;
       this.color = color;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFlavor() {
        return this.flavor;
    }
    
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }




}

