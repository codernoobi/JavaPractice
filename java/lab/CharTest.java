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
class CharTest
{
public static void main(String args[]) throws IOException
{
    char ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));       

   while(true)//execute repeatedly
   {
    System.out.println("Enter a character:");
    ch=(char)br.read();
    //test and display the type of character 
    System.out.print("your entered:");
    if(Character.isDigit(ch))
    System.out.println("a digit");
    else if(Character.isUpperCase(ch))
        System.out.println("an uppercase letter");
    else if(Character.isLowerCase(ch))
    System.out.println("a lowercase letter");
    else if(Character.isSpaceChar(ch))
        System.out.println("a spacebar character");
    else if(Character.isWhitespace(ch))
    {
      System.out.println("a white space character");
      return;
    }
    else System.out.println("Sorry,I dont know that");
    br.skip(2);//to\n code from br
   }
        
}    
}
