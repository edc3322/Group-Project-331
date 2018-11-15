/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project331;


public class Sale {
    int saleID = 3000;
    Item itemSold;
    double sellingPrice;
    int quantity;
    String customer;
    String date;
    
    public Sale(Item itemSold, double sellingPrice, int quantity, String customer, String date)
    {
        this.itemSold = itemSold;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.customer = customer;
        this.date = date;
        this.saleID++;
    }
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + itemSold.itemName + ", Selling Price: $" + String.valueOf(itemSold.sellingPrice()) + ", Quantity: " + String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity * itemSold.sellingPrice());
        System.out.println(saleReceipt):
    
    
    
}
