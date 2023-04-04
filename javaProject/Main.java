import java.text.DecimalFormat;
import java.util.*;


public class Main{

    private int customerNumber;
    private int pinNumber;
    private double currentBalance = 0;
    private double savingsBalance = 0;

    Scanner s = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'₹'###,##0.00");
    
    public int setCustomernumber(int c)
    {
        this.customerNumber = c;
        return customerNumber;
    }
    public int getCustomerID()
    {
        return customerNumber;
    }
    public int setCustomerPINnumber(int p)
    {
        this.pinNumber = p;
        return pinNumber;
    }
    int getCustomerPIN()
    {
        return pinNumber;
    }
    public double getcurrentbalance()
    {
        return currentBalance;
    }
    public double calcCurrenwithdrawtbal(double a)
    {
        currentBalance = (currentBalance-a);
        return currentBalance;
    }
    public double calcSavingwithdrawsbal(double a)
    {
        savingsBalance = (savingsBalance - a);
        return savingsBalance;
    }
    public double calcCurrentdepositebal(double a)
    {
        currentBalance = (currentBalance+a);
        return currentBalance;
    }
    public double calcSavingsdepositebal(double amount)
    {
        savingsBalance = (savingsBalance+amount);
        return savingsBalance;
    }
    public void getCurrentdeposite()
    {
        System.out.println("Current Account Balance:"+moneyFormat.format(currentBalance));
        System.out.print("Enter the amount you want to deposite:");
        double amount = s.nextDouble();

        if((currentBalance+amount)>=0)
        {
            calcCurrentdepositebal(amount);
            System.out.println("New Current Account Balance:"+moneyFormat.format(currentBalance));
        }
        else
        {
            System.out.println("Balance cannot be Negetive");
        }
    }
    public void getCurrentwithdraw()
    {
        System.out.println("Current Account Balance:"+moneyFormat.format(currentBalance));
        System.out.print("Enter the amount you want to withdraw:");
        double amount = s.nextDouble();

        if((currentBalance-amount)>=0)
        {
            calcCurrenwithdrawtbal(amount);
            System.out.print("New Current Account balance:"+ moneyFormat.format(currentBalance));
        }
        else
        {
            System.out.print("Balance cannot be Negetive");
        }
    }
    public void getSavingswithdraw()
    {
        System.out.println("Savings Account Balance:"+moneyFormat.format(savingsBalance));
        System.out.print("Enter the amount you want to withdraw:");
        double amount = s.nextDouble();

        if((savingsBalance-amount)>=0)
        {
            calcSavingwithdrawsbal(amount);
            System.out.print("New Current Account balance:"+ moneyFormat.format(savingsBalance));
        }
        else
        {
            System.out.print("Balance cannot be Negetive");
        }
    }
    public void getSavingsdeposite()
    {
        System.out.println("Savings Account Balance:"+moneyFormat.format(savingsBalance));
        System.out.print("Enter the amount you want to deposite:");
        double amount = s.nextDouble();

        if((savingsBalance+amount)>=0)
        {
            calcSavingsdepositebal(amount);
            System.out.println("New Savings Account balance:"+moneyFormat.format(savingsBalance));
        }
        else
        {
            System.out.println("Balance cannot be Negetive");
        }
    }

}
