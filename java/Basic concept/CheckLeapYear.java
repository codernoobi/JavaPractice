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
public class CheckLeapYear {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a year to check it is leap or not");
        int year=in.nextInt();
        if(year%4==0)
            System.out.println(year+" is a LEAP year");
        else 
            System.out.println(year+" is not a LEAP year");
    }
}
