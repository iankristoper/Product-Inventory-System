package com.ian.product_inventory_system;

/**
 *
 * @author Ian Tagano
 */

public class ElectronicProduct extends Product
{
    //private attributes for the electronic product
    private final String brand;
    
    //constructor for the electronic product 
    public ElectronicProduct(String name, double price, int quantity, String brand) 
    {
        super(name, price, quantity);
        this.brand = brand;
    }

    
    @Override
    public void displayProductDetails()
    {
        System.out.println("Electronic Product: " + getName() + " by " + brand);
        System.out.println("Price: $" + getPrice());
        System.out.println("Available Quantity: " + getQuantity());
    }
    
    
    @Override
    public void updateStock(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }
    
    @Override
    public void calculateTotalPrice(int quantity) {
        System.out.println("Total Price for " + quantity + " units of " + getName() + ": $" + (getPrice() * quantity));
    }
}
