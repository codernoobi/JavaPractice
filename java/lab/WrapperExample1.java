/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class WrapperExample1{  
public static void main(String args[]){  
//Converting int into Integer  
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(a+" "+i+" "+j);  
}}  
