/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */
package group.project;

public class Contractor extends Customer 
{
    private static int contractorCount = 6000;
    private int contractorID;
    public String contractorName; 
    public long contractorNumber; 
    public String contractorAddress; 
    Customer firstName; 
    
public Contractor (String firstName, String lastName, String city, String street, 
        String state, int zip, String contractorName, long contractorNumber, 
        String contractorAddress)
    {
        super(firstName, lastName, city, state, street, zip, contractorNumber);
        this.contractorName = contractorName;
        this.contractorNumber = contractorNumber;
        this.contractorAddress = contractorAddress; 
        this.contractorID = contractorCount;
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
    
    
}
