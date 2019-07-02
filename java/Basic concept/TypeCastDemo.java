/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class TypeCastDemo {
    public static void main(String args[]){
        int i=100;
        long l=i;
        float f=l;
        char ch='A';
        int num=(int)ch;
        System.out.println("int value:"+i);
        System.out.println("long value:"+l);
        System.out.println("float value:"+f);
        System.out.println("char:"+ch);
        System.out.println("num:"+num);
    }
    
}

