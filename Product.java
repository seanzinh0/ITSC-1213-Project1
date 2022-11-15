/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject1;

/**
 *
 * @author seanpichay
 */
public class Product {

    private int productID = 0;
    private String description = "";
    private double price;

    public Product(int productID, double price, String description) {
        this.productID = productID;
        this.description = description;
        this.price = price;
    }

    public int getID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setID(int productID) {
        this.productID = productID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: " + ", ID: " + getID() + ", " + getDescription() + ", " + getPrice();
    }

    int amonut;
}
