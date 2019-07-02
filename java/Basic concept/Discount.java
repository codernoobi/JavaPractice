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
public class Discount {
     double amount=0;
     void input()
     {
         System.out.println("Enter the total amount");
         Scanner in=new Scanner(System.in);
         amount=in.nextInt();
     }
     void calculate()
     {
         if(amount<2000)
             amount=amount*0.5;
         else if(amount>=2000 && amount<5000)
             amount=amount*0.25;
          else if(amount>=5000 && amount<10000)
             amount=amount*0.35;
         else
              amount=amount*0.50;
     }
     void display()
     {
         System.out.println("Amount after Discount:"+amount);
     }
}
     class q2Discount{
         public static void main(String args[]){
         Discount d=new Discount();
         d.input();
         d.calculate();
         d.display();
     }
    
}
