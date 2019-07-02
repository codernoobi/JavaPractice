/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.text.DecimalFormat;
import java.util.Scanner; 
public class MobilePhoneBill {
    public static void main(String[] args){
            
            Scanner keyboard=new Scanner(System.in);
            DecimalFormat df=new DecimalFormat("0.00");
            
            final double TEXTCOST=0.25;
            final double CALLCOST=0.10;
            final double DISCOUNT=0.20;
            int textUsed;
            double callUsed,totalForCall,totalForText,totalTogether,totalDiscount,finalTogForDis;
            
            System.out.println("Please enter the number of minutes used:");
            callUsed=keyboard.nextDouble();
            System.out.println("Please enter the number of text used:");
            textUsed=keyboard.nextInt();
            
            totalForCall=callUsed*CALLCOST;
            totalForText=textUsed*TEXTCOST;
            totalTogether=totalForCall+totalForText;
            totalDiscount=totalTogether*DISCOUNT;
            finalTogForDis=totalTogether-totalDiscount;
            
            if(totalTogether>=15)
            {
              System.out.println("Number of texts used is:"+df.format(textUsed));
              System.out.println("Number of minutes used is:"+df.format(callUsed));
              System.out.println("Your discount is:"+df.format(totalDiscount));
              System.out.println("Final total is:"+df.format(finalTogForDis));
            }
            else
            {
              System.out.println("Number of texts used is:"+df.format(textUsed));
              System.out.println("Number of minutes used is:"+df.format(callUsed));
              System.out.println("You are not entitled for discount this time");
              System.out.println("Final total is:"+df.format(totalTogether));
            }
    }    
}
