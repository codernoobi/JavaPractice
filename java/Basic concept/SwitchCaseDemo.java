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
public class SwitchCaseDemo {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("1.North\n2.South\n3.East\n4.West");
        System.out.println("Choose a number");
        num=in.nextInt();
        switch(num)
        {
            case 1:System.out.println("NORTH");
                break;
            case 2:System.out.println("SOUTH");
                break;
            case 3:System.out.println("EAST");
                break;
            case 4:System.out.println("WEST");
                break;
        }
    }
}
