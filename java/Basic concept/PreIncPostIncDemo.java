/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class PreIncPostIncDemo {
    public static void main(String args[]){
        int a=5;
        int i;
        i=++a + ++a + a++;
        i=a++ + ++a + ++a;
        a=++a + ++a + a++;
        System.out.println("a:"+a+"\ni:"+i);
    }
}
