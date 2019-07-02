/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash //copy madi ee build up
 */
import java.lang.*;
import java.io.*;
public class EmployeeDetais {
    public static void main(String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));;
         int num=0;
         double salary=0.0;
         int i;
         String name="";
         String dept="";
         System.out.println("Enter number of employees:");
        num=Integer.parseInt(br.readLine());
        for(i=1;i<=num;i++)
        {
            System.out.println("Enter name of employee "+i);
            name=br.readLine();
            System.out.println("Enter salary of employee "+i);
            salary=Double.parseDouble(br.readLine());
            System.out.println("Enter the department of employee "+i);
            dept=br.readLine();
        }
        System.out.println("NUMBER\tNAME\tSALARY\tDEPARTMENT");
        for(i=1;i<=num;i++)
        {
            System.out.println(i+"\t"+name+"\t"+salary+"\t"+dept);
        }
    }
        
}

