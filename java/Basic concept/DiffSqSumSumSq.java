/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */import java.util.*;
public class DiffSqSumSumSq {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
       
        System.out.println("Enter the first number");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        
        System.out.println("Sum of squares:");
        int c=a*a;
        int d=b*b;
        c=c+d;
        System.out.println(c);
        
        System.out.println("squares of sum:");
        int e=a+b;
        int f=e*e;
        System.out.println(f);
       
        System.out.println("Difference of SUM OF SQUARES and SQUARE OF SUM:");
        int g=c-f;
        System.out.println(g);
    }
}
