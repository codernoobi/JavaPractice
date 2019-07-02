/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class RefCast {
    void show1(){
        System.out.println("Super class method");
    }
}
class Two extends RefCast{
    void show2(){
        System.out.println("Sub class");
    }
}
class Cast{
    public static void main(String args[]){
        RefCast o;
        o=(RefCast)new Two();
        o.show1();
    }
}