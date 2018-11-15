/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project331;


public class Contractor extends Customer 
{
    public String contractorName; 
    public long contractorNumber; 
    public String contractorAddress; 
    public int contractorID = 2000;
    

    public Contractor (String firstName, String lastName, String city, String state, int zip, String contractorName, long contractorNumber, String contractorAddress)
    {
        super (firstName);
        super (lastName);
        super (city);
        super (state);
        super(zip);
        this.contractorName = contractorName;
        this.contractorNumber = contractorNumber;
        this.contractorAddress = contractorAddress; 
        this.contractorID++;
    }
    
    public void setContractorName (String contractorName) //setting the contractor company name
    {
    this.contractorName = contractorName; 
    }
    
    public void setContractorNumber (long contractorNumber) //setting contractor company number
    {
    this.contractorNumber = contractorNumber; 
    }
    
    
}
