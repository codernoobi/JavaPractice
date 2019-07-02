/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
class StringDemos
{
 public static void main(String...s)
 {
  int word=1;
  String str="count number of words and sapces";
 
  for(int i=0;i<str.length();++i)
  {
   if(str.charAt(i)==' ')
    word++;
  }
 
  System.out.println("Number of words="+word);
  System.out.println("Number of spaces="+(word-1));
 }
}
