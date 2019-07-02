/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class StringBufferInsert {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello");
        sb.insert(1,"Java");
        System.out.println(sb);
    }
}
