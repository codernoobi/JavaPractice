/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */

public class LongToStringExample {
 
  public static void main(String[] args) {
    Long lObj = new Long(10);
   
    //use toString method of Long class to convert Long into String.
    String str = lObj.toString();
    System.out.println("Long converted to String as " + str);
  }
}
