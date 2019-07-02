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
public class PhoneBill {
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
       
        final double WEEKEND=3.0;
        final double WEEKDAY=2.50;
        int day;
        double totalminutes=0.0,total=0.0;
        
        System.out.println("Choose the day:");
        System.out.println("1:Monday\n2:Tuesday\n3:Wednesday\n4:Thursday\n5:Friday\n6:Saturday\n7:Sunday\n");
        day=in.nextInt();
        System.out.println("Enter total time in minutes:");
        totalminutes=in.nextDouble();
        
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:total=totalminutes*WEEKDAY;
            break;
            case 6:
            case 7:total=totalminutes*WEEKEND;
            break;
               
        }
        System.out.println("Total bill:"+df.format(total));
        
        
    }
    
}
