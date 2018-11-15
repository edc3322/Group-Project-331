/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project331;

public class Vendor 
{
    int vID = 5000;
    String businessName, address, city, state;
    long phoneNumber;
    
    Vendor(String businessName, String address, String city, String state, long phoneNumber)
    {
        this.businessName = businessName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.vID++;
    }
    
    public void setBusinessName(String newName)
    {
        this.businessName = newName;
    }
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
    public void setCity(String newCity)
    {
        this.city = newCity;
    }
    public void setState(String newState)
    {
        this.state = newState;
    }
    public void setPhoneNumber(long newNumber)
    {
        this.phoneNumber = newNumber;
    }
    
    public int getVID()
    {
        return this.vID;
    }
    
    @Override
    public String toString()
    {
        String returnString = String.format("%-12d" + "%-16s" + " %-16s" + " %-16s" + " %-12s" + " %-9d",
                this.vID, this.businessName, this.address, this.city, this.state, this.phoneNumber);
        return  returnString;
    }
}
