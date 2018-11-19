/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */


package Project331;

public class Sale {
   private  int saleID;
   Item  itemName;
   public double sellingPrice;
   public int quantity;
   public String customer;
   public String date;
    
   
    public Sale (Item itemName)
    {
        this.itemName=itemName; 
    }
    public Sale()
    {
        this.sellingPrice = 0.0;
        this.quantity =0;
        this.customer = "";
        this.date = "";
        this.saleID=saleID;
    }
    
    //setting sale Id
    public void setSaleID(int saleID)
    {
        this.saleID=saleID;
    }
    public int getSaleID()
    {
        return this.saleID; 
    }
    public void setItemName(Item itemName)
    {
        this.itemName=itemName;
    }
   
    public void setSellingPrice (double sellingPrice)
    {
        this.sellingPrice=sellingPrice;
    }
    public void setQuantity (int quantity)
    {
        this.quantity=quantity;
    }
    
    public void setCustomer (String customer)
    {
        this.customer=customer; 
    }
    
    public void setDate(String date)
    {
        this.date=date; 
    }
    
    public Item getItemName()
    {
        return this.itemName;
    }
    public double getSellingPrice()
    {
        return this.sellingPrice; 
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public String getCustomer()
    {
        return this.customer;
    }
    
    public String getDate()
    {
        return this.date; 
    }
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + itemName.getItemID() + ", Selling "
        + "Price: $" + String.valueOf(this.sellingPrice) + ", Quantity: " + 
        String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity 
         * this.sellingPrice);
        System.out.println(saleReceipt);
    }

    

}
