/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class Random {
    public static void main (String args[]) throws Exception{
        
        System.out.println("Random numbers between 0 and 10 : ");
        while(true){
            double d = 10*Math.random();
            int i = (int)d;
            System.out.println(i);
            Thread.sleep(2000);
            if(i==0)
                System.exit(0);
        }
    }
    
}

