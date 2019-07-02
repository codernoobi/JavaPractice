/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.util.*;
public class CircleArea {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    double radius;
    double pi=3.14;
    System.out.println("Enter the radius of the circle");
    radius=in.nextDouble();
    double area=pi*radius*radius;
    System.out.println("Area of Circle is"+area);
    }   
    
}
