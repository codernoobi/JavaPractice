/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 *
 */
import java.util.*;
public class TriangleArea {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        float base;
        float height;
        double area;
        System.out.println("Enter the length of the BASE of the triangle");
        base=in.nextInt();
        System.out.println("Enter the length of the HEIGHT of the triangle");
        height=in.nextInt();
        area=0.5*base*height;
        System.out.println("Area of triangle is:"+area);
        
    }
}
