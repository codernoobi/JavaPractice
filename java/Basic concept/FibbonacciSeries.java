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
public class FibbonacciSeries {
    public static void main(String args[]){
        int s=0,a=0,b=1,n,i=3;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of values required");
        n=in.nextInt();
        System.out.println(a+"\n"+b);
        while(i<=n)
        {
            s=a+b;
            System.out.println(s);
            a=b;
            b=s;
            i++;
        }
                   
    }
}
