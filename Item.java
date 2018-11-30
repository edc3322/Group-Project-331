/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */
package group.project;

public class Item 
{
private static int itemCount = 4000;
private int itemID;
public String itemName;
public double weight;
public String description;
private double purchasePrice;
public double quantity;

public Item(String itemName, double weight, String description, 
        double purchasePrice,  double quantity)
{
	this.itemName = itemName;
	this.weight = weight;
	this.description = description;
	this.purchasePrice = purchasePrice;
	this.quantity = quantity;
	this.itemID=itemCount;
	itemCount++;
}
//setter for item name
public void setName (String itemName)
{
    this.itemName=itemName;
}

public String getItemName()
{
    return this.itemName;
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

public void setQuantity(double quantity)
{
     this.quantity = quantity;
}	
	
public double getQuantity()
{
	return this.quantity;
}
	
	@Override
public String toString()
{
    String returnString = String.format("%-12d" + " %-16s" + " %-16.2f", this.itemID, this.itemName, this.quantity);
    return returnString;
}
	
}
