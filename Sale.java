/*  
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */ 

package Project331;

public class Sale {
    private int saleID = 3000;
    Item newItem;
    public double sellingPrice;
    public int quantity;
    public String customer;
    public String date;
    
    public Sale(Item newItem)
    {
        this.newItem = newItem;
    }
    
    public Sale(Item newItem, double sellingPrice, int quantity, String customer, String date)
    {
        this.newItem = newItem;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.customer = customer;
        this.date = date;
        this.saleID++;
    }
 public int getId()
 {
  return this.saleID++; 
 }
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + newItem.getItemID() + ", " + 
         Selling Price: $" + String.valueOf(this.sellingPrice) + ", Quantity: " 
         + String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity * this.sellingPrice);
        System.out.println(saleReceipt);
    }

    

}
