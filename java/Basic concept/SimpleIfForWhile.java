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
public class SimpleIfForWhile {
   public static void main(String args[]){ 
       int v,i;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter v");
       v=in.nextInt();
       
       System.out.println("IF");
       if(v<10)
       { 
           System.out.println(v);
           v++;
       }
       
       System.out.println("FOR");
       for(i=0;i<v;i++)
           System.out.println(i);
       
       System.out.println("WHILE");
       while(v<10)
       {
           System.out.println(v);
           v++;
       }
       
       System.out.println("DO WHILE");
       do
       {
           System.out.println(v);
           v++;
       }
       while(v<15);
       
       /*System.out.println("Infinitive for");
       for(;;)
       {
            System.out.println("Infinitive for");
       }*/
   }
}
