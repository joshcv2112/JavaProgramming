//*********************************************************
// Author: Malik/Burton
// Modifications by: Joshua Vaughan
// 
// This program inplements the class CableBill.
//*********************************************************

public class CableCompanyMainProg
{
    public static void main(String[] args)
    {
        CableBill John = new CableBill('r', 12345, 1, 3);
        CableBill interStateRanch = new CableBill('b', 44236, 20, 8);

        System.out.println("\nJohn's Bill:\n" + John);

        System.out.println("InterStateRanch's Bill:\n" + interStateRanch + "\n");
    }
}
