/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.util.Scanner;
public class Switch {
    public static void main(String args[]) {
        Scanner keyboard=new Scanner(System.in);
        int month; 
        String season; 
        System.out.println("1:January\n2:Febraury\n3:March\n4:April\n5:May\n6:June\n7:July\n8:August\n9:September\n10:October\n11:November\n12:December");
        month=keyboard.nextInt();
        switch (month) { 
            case 12: 
            case 1: 
            case 2: season = "Winter"; 
            break; 
            case 3:
            case 4: 
            case 5: season = "Spring"; 
            break; 
            case 6: 
            case 7: 
            case 8: season = "Summer"; 
            break; 
            case 9: 
            case 10: 
            case 11: season = "Autumn"; 
            break; 
            default: season = "Bogus Month"; 
        } 
        System.out.println(" is in the " + season + "."); 
    }

    
}
