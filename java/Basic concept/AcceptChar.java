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
public class AcceptChar {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        char a;
        System.out.println("Enter a character");
        a=in.next().charAt(0);
        System.out.println("Entered character is '"+a+"'");
    }
}
