/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject1;

/**
 *
 * @author seanpichay
 */
public class DVD extends Product {

    public DVD(int pID, double price, String description) {
        super(pID, price, description);
    }

    @Override
    public String toString() {
        return "DVD(ID: " + getID() + ", " + getDescription() + ", " + String.format("$%,.2f", getPrice()) + ") ";
    }
}
