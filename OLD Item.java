/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */

package Project331;

public class Item 
{
private int itemID;
public String itemName;
public double weight;
public String description;
private double purchasePrice;
public double sellingPrice;

public Item(int itemID, String itemName, double weight, String description, 
        double purchasePrice, double sellingPrice)
{
	this.itemName = itemName;
	this.weight = weight;
	this.description = description;
	this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice; 
	this.itemID=itemID;
}
//setter for item name
public void setName (String itemName)
{
    this.itemName=itemName;
}

public Item getItemName()
{
    return this.getItemName();
}
public void setDescription (String description)
{
    this.description=description;
}

public String getDescription()
{
    return this.description;
}
public int getItemID()
{
    return this.itemID;
}

public void setSellingPrice (double sellingPrice)
{
    this.sellingPrice=sellingPrice;
}

public double getSellingPrice()
{
    return this.sellingPrice;
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

public void setWeight(double weight)
{
    this.weight=weight;
}

public double getWeight()
{
    return this.weight;
}
	@Override
public String toString()
{
    String returnString = String.format("%-12d" + " %-16s" + " %-16f" + " %-20s" 
    + " %-12f" + " %-12f", this.itemID, this.itemName, this.weight, 
    this.description, this.purchasePrice, this.sellingPrice);
    return returnString;
}
	
}
