/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject1;

/**
 *
 * @author seanpichay
 */
public class Customer {

    private String firstName;
    private String lastName;
    private int ID;
    private double moneySpent;
    private boolean isPaid;
    private boolean isPremiumMember;
    private String paymentMethod;

    public Customer(String firstName, String lastName, int ID, double moneySpent, boolean isPaid, boolean isPremiumMember, String payMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.moneySpent = moneySpent;
        this.paymentMethod = paymentMethod;
        this.isPaid = isPaid;
        this.isPremiumMember = isPremiumMember;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isPremiumMember() {
        return isPremiumMember();
    }

    public String paymentMethod() {
        return paymentMethod;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public void setIsPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Customer (" + "Name: " + firstName + " " + lastName + ", ID: " + ID + ", Money Spent: " + String.format("$%,.2f", getMoneySpent()) + ", Membership Paid?(t/f) " + isPaid + ", Premium Member? " + isPremiumMember + ", Payment Method: " + paymentMethod + ")";
    }

}
