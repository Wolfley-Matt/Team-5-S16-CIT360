/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.io.Serializable;

/**
 *
 * @author co075oh
 */
public class IceCream implements Serializable {
    private String flavor;
    private String color;
    private int cost;
    private String size;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void displayIceCream() {
        System.out.printf("%-10s%-25s%n", "Flavor:", this.flavor);
        System.out.printf("%-10s%-25s%n", "Color:", this.color);
        System.out.printf("%-10s%-25s%n", "Cost:", this.cost);
        System.out.printf("%-10s%-25s%n", "Size:", this.size);
    }
}