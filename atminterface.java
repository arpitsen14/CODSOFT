import java.util.Scanner;
public class atminterface
{
    public static void main(String args[])
    {
        int balance=500000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("WELCOME TO XYZ ATM\n PLEASE SELECT ANY OF THE BELOW OPTIONS TO PROCEED");
            System.out.println("1:- Withdraw");
            System.out.println("2:- Deposit");
            System.out.println("3:- Check Balance");
            System.out.println("4:- Cancel Transaction\n");
            System.out.println("Select");
            int select=sc.nextInt();
            switch(select)
            {
                case 1:System.out.println("Please enter your amount to be withdrawn");
                        withdraw=sc.nextInt();
                        if(balance>=withdraw)
                        {
                            balance=balance-withdraw;
                            System.out.println("Please collect your Money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        break;
                case 2: System.out.println("Enter money to be deposited");
                        deposit=sc.nextInt();
                        balance=balance+deposit;
                        System.out.println("Your money has been successfully deposited\nHave a nice Day");
                        break;
                case 3:System.out.println("Your Current Balance is:\t"+balance);
                        break;
                case 4:System.exit(0);
            sc.close();
            }
        }
       
    }
}