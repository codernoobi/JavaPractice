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
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=in.nextInt();
        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        }
    
}
