/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class DataTypeCast {
    public static void main(String args[]){
        byte b;
        int i=81;
        double d=3.142;
        float f=72.38f;
        char c='A';
        c=(char)i;
        System.out.println("i="+i+"  c="+c);
        i=(int)d;
        System.out.println("d="+d+"  i="+i);
        i=(int)f;
        System.out.println("f="+f+"  i="+i);
        b=(byte)d;
        System.out.println("d="+d+"  b="+b);
    }
    
}
