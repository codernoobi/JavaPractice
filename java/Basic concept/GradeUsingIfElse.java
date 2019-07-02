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
public class GradeUsingIfElse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String name;
        double marks;
        System.out.println("Enter the name of the Student");
        name=in.next();
        System.out.println("Enter the marks scored by student out of 100");
        marks=in.nextDouble();
        if(marks>=75)
            System.out.println("Your GRADE is A");
        else if(marks>=60 && marks<75)
            System.out.println("Your GRADE is B");
        else if(marks>=35 && marks<60)
            System.out.println("Your GRADE is C");
        else
            System.out.println("Your GRADE is F");
    }
}
