import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class opMenu extends Main {

    Scanner s = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'₹'###,##0.00");

    HashMap<Integer,Integer> details = new HashMap<Integer,Integer>();
    public void Login() throws IOException 
    {
        int x = 1;
        do{
            try
            {
                details.put(12345,67788);
                details.put(34567,89012);
                System.out.println("Welcome");
                System.out.println("Enter your customer Number:");
                setCustomernumber(s.nextInt());
                System.out.println("Enter your PIN Number");
                setCustomerPINnumber(s.nextInt());


            }catch(Exception e){
                System.out.println("\n"+"INvalied Characters.ONly NUmbers"+"\n");
                x = 2;
            }

            int  c = getCustomerID();
            int  p = getCustomerPIN();
            if(details.containsKey(c)&&details.get(c)==p)
            {
                getAccType();
            } 
            else{
                System.out.println("\n"+"Wrong customer number or pin"+"\n");
            } 
        }while(x==1);
    }
    public void getAccType()
    {
        System.out.println("Select the account type:");
        System.out.println("1.Current");
        System.out.println("2.Savings:");
        System.out.println("3.Exit");

        int selection = s.nextInt();
        switch(selection)
        {
            case 1:
                getCurrent();
                break;
            case 2:
                getSavings();
                break;
            case 3:
                System.out.println("Thanks for using Atm. \n");
                break;
            default:
                System.out.println("Invalied choice \n");
                getAccType();
            

        }
    }
     
    void getCurrent()
    {
        System.out.println("CURRENT ACCOUNT");
        System.out.println("1.View Balance");
        System.out.println("2.WithDraw");
        System.out.println("3.Deposite");
        System.out.println("4.Exit");
        System.out.println("Choice:");

        int selection = s.nextInt();

        switch(selection)
        {
            case 1:
                System.out.println("Current account Balance:" + moneyFormat.format(details));
                getAccType();
                break;
            case 2:
                getCurrentwithdraw();
                getAccType();
                break;
            case 3:
                getCurrentdeposite();
                getAccType();
            case 4:
                System.out.println("Thanks for using ATM \n");
            default:
                System.out.println("\n Invalied Choice"+"\n");
                getCurrent();
        }
    }
    void getSavings()
    {
        System.out.println("SAVINGS ACCOUNT");
        System.out.println("1.View Balance");
        System.out.println("2.WithDraw");
        System.out.println("3.Deposite");
        System.out.println("4.Exit");
        System.out.println("Choice:");

        int selection = s.nextInt();

        switch(selection)
        {
            case 1:
                System.out.println("Current account Balance:" + moneyFormat.format(details));
                getAccType();
                break;
            case 2:
                getSavingswithdraw();
                getAccType();
                break;
            case 3:
                getSavingsdeposite();
                getAccType();
            case 4:
                System.out.println("Thanks for using ATM \n");
            default:
                System.out.println("\n Invalied Choice"+"\n");
                getCurrent();
        } 
    }





}