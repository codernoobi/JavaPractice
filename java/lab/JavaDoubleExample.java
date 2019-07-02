/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class JavaDoubleExample {
 
  public static void main(String[] args) {
   
    //create a Double object using one of the below given constructors
   
    //1. Create an Double object from double primitive type
    double d = 10.10;
    Double dObj1 = new Double(d);
    System.out.println(dObj1);
   
    /*
    2. Create Double object from String. Please note that this method can
    throw NumberFormatException if string doesnt contain parsable number.
    */
    Double dObj3 = new Double("25.34");
    System.out.println(dObj3);    
   
   
   
  }
}
