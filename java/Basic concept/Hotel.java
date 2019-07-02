/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.util.*;
public class Hotel {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int d;
        float laundary,breakfast,lunce,dinner,wifi,room_service;
               
        System.out.println("CHARGES PER DAY");
        System.out.println("Stay:600.00\nLaundary:50.00\nWifi:50.00\nBreakfast:75.00\nLunch:100.00\nDinner:100\n");
        
        System.out.println("Enter the number of days of stay");
        d=s.nextInt();
        
        float l=d*50;
        float w=d*50;
        float b=d*75;
        float l1=d*100;
        float d1=d*100;
        float td=d*600;
        float total=l+w+b+l1+d1+td;
        
        System.out.println("Number of days of stay:"+d);
        System.out.println("Laundry cost:"+l);
        System.out.println("Wifi cost:"+w);
        System.out.println("Breakfast cost:"+b);
        System.out.println("Lunch cost:"+l1);
        System.out.println("Dinner cost:"+d1);
        System.out.println("Room cost:"+td);
        System.out.println("Total:"+total);
    }
    
}
