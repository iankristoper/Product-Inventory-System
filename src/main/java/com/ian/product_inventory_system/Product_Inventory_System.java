package com.ian.product_inventory_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ian Tagano
 */


public class Product_Inventory_System 
{

    public static void main(String[] args) 
    {
        List<Product> inventory = new ArrayList<>();
        
        //add electronic product
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 999.99, 10, "hp");
        inventory.add(laptop);
        
        //dd clothing product
        ClothingProduct shirt = new ClothingProduct("T-Shirt", 19.99, 50, "M");
        inventory.add(shirt);

        //add grocery product
        GroceryProduct milk = new GroceryProduct("Milk", 2.99, 20, "2024-01-10");
        inventory.add(milk);
        
        
        //display product details
        for(Product product : inventory)
        {
            product.displayProductDetails();
            System.out.println();
        }
        
        
        //update stock and calculate total price 
        for(Product product : inventory)
        {
            product.updateStock(5);
            product.calculateTotalPrice(3);
            System.out.println();
        }
    }
    
    
}
