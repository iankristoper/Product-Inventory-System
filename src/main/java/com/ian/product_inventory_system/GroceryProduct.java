package com.ian.product_inventory_system;

/**
 *
 * @author Ian Tagano
 */

public class GroceryProduct extends Product 
{
    private final String expirationDate;

    public GroceryProduct(String name, double price, int quantity, String expirationDate) 
    {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayProductDetails() 
    {
        System.out.println("Grocery Product: " + getName() + " (Expires on " + expirationDate + ")");
        System.out.println("Price: $" + getPrice());
        System.out.println("Available Quantity: " + getQuantity());
    }

    @Override
    public void updateStock(int quantity) 
    {
        this.quantity += quantity;
    }

    @Override
    public void calculateTotalPrice(int quantity) 
    {
        System.out.println("Total Price for " + quantity + " units of " + getName() + ": $" + (getPrice() * quantity));
    }
}
