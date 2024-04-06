package com.ian.product_inventory_system;

/**
 *
 * @author Ian Tagano
 */

public abstract class Product 
{
    //private instance variables 
    private final String name;
    private final double price;
    protected int quantity;
    
    
    //constructor for initializing the instance variable
    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    //getter
    public String getName()
    {
        return name;
    }
    
    //getter
    public double getPrice()
    {
        return price;
    }
    
    //getter
    public int getQuantity()
    {
        return quantity;
    }
    
    
    //abstract methods 
    public abstract void displayProductDetails();

    public abstract void updateStock(int quantity);

    public abstract void calculateTotalPrice(int quantity);
}
