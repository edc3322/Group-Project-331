/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */
package GroupProject331;


public class Contractor extends Customer 
{
    private static int contractorCount = 6000;
    private int contractorID;
    public String contractorName; 
    public long contractorNumber; 
    public String notes; 
    Customer firstName; 
    
public Contractor (String contractorName, String city, String state, 
        String street, int zip, long contractorNumber, String notes)
    {
        super(city, state, street, zip, contractorNumber, notes);
        this.contractorName = contractorName;
        this.phoneNumber = contractorNumber; 
        this.contractorID = contractorCount;
        this.description = notes;
        contractorCount++;
    }
    

    //setting the contractor company name
    public void setContractorName (String contractorName) 
    {
       this.contractorName = contractorName; 
    }
    public String setContractorAddress( String contractingAddress)
    {
        contractingAddress ="";
        contractingAddress += this.street + ", "; 
        contractingAddress += this.city + ", ";
        contractingAddress += this.state + ", ";
        contractingAddress += this.zip;
        return contractingAddress; 
    }
    
    //setting contractor company number
    public void setContractorNumber (long contractorNumber) 
    {
        this.contractorNumber = contractorNumber; 
    }
    
    public int getContractorID()
    {
        return this.contractorID;
    }
    public String shortString()
    {
        String returnString = String.format("%-8d %-12s", this.contractorID, this.contractorName);
        return returnString;
    }
    
}
