//*********************************************************
// Author: Malik/Burton
// Modifications by: Joshua Vaughan
// 
// This class implements billings for a cable company.
// It contains methods to calculate and print a customer's
// bill. Two types of customers - residential and business
// are processed.
//*********************************************************

public class CableBill
{
    // Named constants - residential customers
    private static final double R_BILL_PROC_FEE = 4.50;
    private static final double R_BASIC_SERV_COST = 20.50;
    private static final double R_COST_PREM_CHANNEL = 7.50;

    // Named constants - business customers
    private static final double B_BILL_PROC_FEE = 15.00;
    private static final double B_BASIC_SERV_COST = 75.00;
    private static final double B_BASIC_CONN_COST = 5.00;
    private static final double B_COST_PREM_CHANNEL = 50.00;

    private char customerType;
    private int accountNum;
    private int numOfBasicServConnections;
    private int numOfPremChannels;

    // Default constructor 
    public CableBill()
    {
        customerType = ' ';
        accountNum = -1;
        numOfBasicServConnections = 0;
        numOfPremChannels = 0;
    }

    // Begin standard constructor 
    public CableBill(char cType, int aNum, int nbsConnection, int npChannels)
    {
        customerType = cType;
        accountNum = aNum;
        numOfBasicServConnections = nbsConnection;
        numOfPremChannels = npChannels;
    }

    // START set functions
    public void setAccountNum(int aNum)
    {
        accountNum = aNum;
    }

    public void setCustomerType(char cType)
    {
        customerType = cType;
    }

    public void setNumOfBasicServConn(int connections)
    {
        numOfBasicServConnections = connections;
    }

    public void setNumOfPremChannels(int channels)
    {
        numOfPremChannels = channels;
    }// END set functions

    // START Get functions
    public char getCustomerType()
    {
        return customerType;
    }

    public int getAccountNum()
    {
        return accountNum;
    }

    public int getNumOfBasicServConn()
    {
        return numOfBasicServConnections;
    }

    public int getNumOfPremChan()
    {
        return numOfPremChannels;
    }// END get functions 

    // Function that returns customer's bill as a string.
    public String toString()
    {
        String billStr;

        if (customerType == 'r' || customerType == 'R')
        {
            billStr = "Account Number: " + accountNum + "\n"
                    + "Number of premium channels: " + numOfPremChannels + "\n"
                    + "Amount due: $" + String.format("%.2f %n", residentialCustomer(numOfPremChannels));
        }
        else if (customerType == 'b' || customerType == 'B')
        {
            billStr = "Account Number: " + accountNum + "\n"
                    + "Number of basic service connections: " + numOfBasicServConnections + "\n"
                    + "Number of premium channels: " + numOfPremChannels + "\n"
                    + "Amount due: $"
                    + String.format("%.2f %n", businessCustomer(numOfBasicServConnections, numOfPremChannels));
        }
        else
            billStr = "Invalid customer type . . .\n";
        
        return billStr;
    }

    private double residentialCustomer(int numPChannels)
    {
        double amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + numPChannels + R_COST_PREM_CHANNEL;

        return amountDue;
    }

    private double businessCustomer(int numOfBasicServConn, int numOfPChannels)
    {
        double amountDue;

        if (numOfBasicServConn <= 10)
            amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + numOfPChannels * B_COST_PREM_CHANNEL;
        else
            amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + (numOfBasicServConn - 10)
            * B_BASIC_CONN_COST + numOfPChannels * B_COST_PREM_CHANNEL;
        
        return amountDue;
    }
}
