/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class MyBasicBoolean {
 
    public static void main(String a[]){
        //create Boolean using boolean primitive type
        boolean b1 = true;
        Boolean bObj1 = new Boolean(b1);
        System.out.println("Wrapper class Boolean output: "+bObj1);
        //create Boolean using string value
        Boolean bObj2 = new Boolean("false");
        System.out.println("Wrapper class Boolean output: "+bObj2);
        //how to get primitive boolean value from wrapper class
        System.out.println(bObj1.booleanValue());
    }
}
