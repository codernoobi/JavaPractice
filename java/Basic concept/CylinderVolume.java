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
public class CylinderVolume {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        float radius;
        float height;
        double pi=3.14;
        System.out.println("Enter the radius of cylinder base disk");
        radius=in.nextFloat();
        System.out.println("Enter the height of the Cylinder");
        height=in.nextFloat();
        double volume=pi*radius*radius*height;
        System.out.println("Volume:"+volume);
       }
}
