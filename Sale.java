/*  
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */ 

package Project331;


public class Sale {
   private int saleID = 3000;
   Item itemName;
   private double sellingPrice;
   public int quantity;
   public String customer;
   private String date;
    
    public Sale(Item itemName, double sellingPrice, int quantity, String customer, String date)
    {
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.customer = customer;
        this.date = date;
        this.saleID++;
    }
    
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + itemID.itemName + ", Selling Price: $" + String.valueOf(itemID.sellPrice) + ", Quantity: " + String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity * itemID.sellPrice);
        System.out.println(saleReceipt);
    
    
    
}
