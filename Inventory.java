/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject1;

/**
 *
 * @author seanpichay
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    public ArrayList<Product> inventory = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Inventory() {
        inventory.add(new Book(1212, 7.99, "The Giver"));
   
        inventory.add(new Book(1201, 15.99, "Lord of the Rings"));

        inventory.add(new Book(2336, 10.99, "Narnia"));

        inventory.add(new CD(2321, 12.99, "Nevermind"));

        inventory.add(new CD(2323, 8.99, "Meteora"));

        inventory.add(new CD(6366, 10.99, "In Utero"));

        inventory.add(new DVD(2343, 20.99, "Ironman"));

        inventory.add(new DVD(2322, 22.99, "The Dark Knight"));

        inventory.add(new DVD(1213, 16.99, "Star Wars"));
    }

    public boolean removeProduct(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (id == inventory.get(i).getID()) {
                inventory.remove(inventory.get(i));
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("");
        System.out.println("Catalog");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }

    }

    public int getSize() {
        return inventory.size();
    }

    public Product getProduct(int tempId) {
        return inventory.get(tempId);
    }

}
