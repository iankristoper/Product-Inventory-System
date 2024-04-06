package com.ian.product_inventory_system;

/**
 *
 * @author Ian Tagano
 */

public class ClothingProduct extends Product
{
    private final String size;

    public ClothingProduct(String name, double price, int quantity, String size) 
    {
        super(name, price, quantity);
        this.size = size;
    }

    @Override
    public void displayProductDetails() 
    {
        System.out.println("Clothing Product: " + getName() + " (Size: " + size + ")");
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

