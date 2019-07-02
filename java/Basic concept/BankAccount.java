/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.util.Scanner;
public class BankAccount {
    public static void main(String args[]){
        
        Scanner in=new Scanner(System.in);
        
        int userChoice;
        boolean quit=false;
        float balance=0f;
        
        do
        {
            System.out.println("1:Deposite\n2:With draw\n3:Check balance\n");
            System.out.println("Your choice 0 to quit");
            
            userChoice=in.nextInt();
            
            switch(userChoice)
            {
                case 1:
                    float amount;
                    System.out.println("Amount to Deposite:");
                    amount=in.nextFloat();
                    if(amount<=0)
                        System.out.println("Cant deposite amount");
                    else
                    {
                        balance+=amount;
                        System.out.println("Rs."+amount+"has been deposited");
                    }
                break;
                    
                case 2:
                    System.out.println("Amount to With draw:");
                    amount=in.nextFloat();
                    if(amount<=0 || amount>balance)
                        System.out.println("Withdrawl not possible");
                    else
                    {
                        balance-=amount;
                        System.out.println("Rs."+amount+"has been withdrawed");
                    }
                break;
                    
                case 3:
                    System.out.println("Balance is:"+balance);
                break;
                    
                case 0:
                    quit=true;
                break;
                    
                default:
                    System.out.println("Wrong choice");
                break;
            }
            System.out.println();
        } 
        while(!quit);
        System.out.println("Thank you");
    }
}
    

