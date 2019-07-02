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
public class Availability {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10},i;
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println("Enter the number to be found");
        int n=in.nextInt();
        for(i=0;i<a.length;i++)
            if(n==a[i])
                System.out.println(n+" is in the array at "+i+"th location");
    }
}
