/*  
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */ 

package Project331;

public class Sale {
    int saleID = 3000;
    Item newItem;
    double sellingPrice;
    int quantity;
    String customer;
    String date;
    
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
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + newItem.getID() + ", Selling Price: $" + String.valueOf(this.sellingPrice) 
                + ", Quantity: " + String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity * this.sellingPrice);
        System.out.println(saleReceipt);
    }

    

}
