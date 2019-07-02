/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.io.*;
public class ElectricityBill {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String nm=br.readLine();
        System.out.println("Entered the units consumed:");
        int units=Integer.parseInt(br.readLine());
        double charges=0.0,fbill=0.0;
        
        if(units<=100)
            charges=units*1.50;
        else if(units<=200)
            charges=(100*1.50)+(units-100)*2;
        else if(units<=250)
            charges=(100*1.50)+(100*2)+(units-200)*2.50;
        else
            charges=(100*1.50)+(100*2)+(50*2.50)+(units-250)*4;
        
        fbill=charges+250;
        System.out.println("\f");
        System.out.println("Your Electricity Bill");
        System.out.println("*********************");
        System.out.println();
        System.out.println("coutumers Name:"+nm);
        System.out.println("Units Consumed:"+units);
        System.out.println("Charges:"+charges);
        System.out.println("Rent Charges:250Rs");
        System.out.println("Total Bill:"+fbill);
        
    }
}
