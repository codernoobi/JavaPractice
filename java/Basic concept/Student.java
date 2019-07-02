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
import java.io.*;
public class Student {
        String name;
        int sub1;
        int sub2;
        int roll_num;
        float per;
        int total;
        void get()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name of Student");
            name=br.readLine();
            System.out.println("Enter the Roll_num of the student");
            roll_num=Integer.parseInt(br.readLine());
            System.out.println("Enter marks out of 100 for subject1");
            sub1=Integer.parseInt(br.readLine());
            System.out.println("Enter marks out of 100 for subject2");
            sub2=Integer.parseInt(br.readLine());                           
        }
        void show()
        {
            total=sub1+sub2;
            per=(total*100)/200;
            System.out.println("Roll_num:"+roll_num);
            System.out.println("Name:"+name);
            System.out.println("Marks of subject1:"+sub1);
            System.out.println("Marks of subject2:"+sub2);
            System.out.println("Total marks:"+total);
            System.out.println("Percentage:"+per);
        }
}
class q2Student{
    public static void main(String args[])throws IOException{
        Student s=new Student();
        s.get();
        s.show();
    }
}
