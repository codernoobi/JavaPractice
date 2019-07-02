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
import java.io.*;
public class Notepad {
    public static void main(String args[]){
        Runtime rs=Runtime.getRuntime();
        try
                {
        rs.exec("notepad");
         }
        catch(IOException e){
            System.out.println(e);
         }
    }  
    
}
