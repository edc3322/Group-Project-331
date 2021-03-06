/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */

package GroupProject331;

public class Customer 
{
  private static int customerCount = 1000;
  private int cId;
  public int zip;
  public long phoneNumber;
  public String firstName, lastName, city, state, street, description;
    
public Customer(String firstName, String lastName, String city, String state, 
         String street, int zip, long phoneNumber, String description)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.street = street; 
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.cId = customerCount;
        this.description = description;
        customerCount++;
    }

public Customer(String city, String state, String street, int zip, long phoneNumber, String description)
{
        this.city = city;
        this.state = state;
        this.street = street; 
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.cId = customerCount;
        this.description = description;
        customerCount++;
}
    
    // setter for firstName for editing customerss
    public void setFirstName(String newName) 
    {
        this.firstName = newName;
    }
    
    public void setLastName(String newName)
    {
        this.lastName = newName;
    }
    
    public void setCity(String newCity)
    {
        this.city = newCity;
    }
    
    public void setState(String newState)
    {
        this.state = newState;
    }
    
    public void setStreet (String newStreet)
    {
        this.street=newStreet; 
    }
    public void setZip(int newZip)
    {
        this.zip = newZip;
    }
    
    public void setPhoneNumber(long newNumber)
    {
        this.phoneNumber = newNumber;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public int getId()
    {
        return this.cId;
    }
                
    
    @Override
    public String toString()
    {
      String returnString = String.format("%-12d" + " %-16s" + " %-16s" + " %-16s" 
      + " %-16s" + " %-12s" + " %-10d" + " %-9d", this.cId, this.firstName, 
      this.lastName, this.city, this.street, this.state, this.zip, this.phoneNumber);
        return  returnString;
    }
    
    public String shortString()
    {
        String returnString = String.format("%-8d %-12s %-12s", this.cId, this.firstName, this.lastName);
        return returnString;
    }
}
