
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.lang.*;
import java.util.*;
public class GradeGroup {
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
         int num=0;
         int age=0;
         int i;
         int roll_no=0,score=0;
         String name="";
         System.out.println("Enter number of students:");
        num=in.nextInt();
        for(i=1;i<=num;i++)
        {
            System.out.println("Enter name of student "+i);
            name=in.next();
            System.out.println("Enter age of student "+i);
            age=in.nextInt();
            System.out.println("Enter the roll_no of student "+i);
            roll_no=in.nextInt();
            System.out.println("Enter the score of student "+i);
            score=in.nextInt();
        }
        System.out.println("0 to 50");
        System.out.println("NUMBER\tNAME\tAGE\tROLL_NO\tSCORE");
        for(i=1;i<=num;i++)
            if(score>=0 && score<50)
        {
            System.out.println(i+"\t"+name+"\t"+age+"\t"+roll_no+"\t"+score);
        }
        System.out.println("50 to 65");
        System.out.println("NUMBER\tNAME\tAGE\tROLL_NO\tSCORE");
        for(i=1;i<=num;i++)
            if(score>=50 && score<65)
        {
            System.out.println(i+"\t"+name+"\t"+age+"\t"+roll_no+"\t"+score);
        }
        System.out.println("65 to 80");
        System.out.println("NUMBER\tNAME\tAGE\tROLL_NO\tSCORE");
        for(i=1;i<=num;i++)
            if(score>=65 && score<80)
        {
            System.out.println(i+"\t"+name+"\t"+age+"\t"+roll_no+"\t"+score);
        }
        System.out.println("80 to 100");
        System.out.println("NUMBER\tNAME\tAGE\tROLL_NO\tSCORE");
        for(i=1;i<=num;i++)
            if(score>=80 && score<=100)
        {
            System.out.println(i+"\t"+name+"\t"+age+"\t"+roll_no+"\t"+score);
        }
    }
        
}

 

