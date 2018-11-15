/*
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */
package Project331;

public class Item 
{
private int itemID = 4000;
public String itemName;
public double weight;
public String description;
private double purchasePrice;

public Item(String itemName, double weight, String description, double 
    purchasePrice)
{
	this.itemName = itemName;
	this.weight = weight;
	this. description = description;
	this.purchasePrice = purchasePrice;
	this.itemID++;
}
	
public int getID()
{
    return this.itemID;
}
	
public boolean setpurchasePrice(double purchasePrice)
{
    if (purchasePrice > 0)
    {
	this.purchasePrice = purchasePrice;
	return true;
    }
	else
	return false;
}
public double getpurchasePrice()
{
    return purchasePrice;
}


	@Override
public String toString()
{
    String returnString = String.format("%-12d" + " %-16s" + " %-16f" + " %-20s" + " %-12f" + " %-12f",
                this.itemID, this.itemName, this.weight, this.description, this.purchasePrice, this.sellPrice);
    return returnString;
}
	
}

