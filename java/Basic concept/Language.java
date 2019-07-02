/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
class Language 
{
  
   String name;
   Language()
     {
       System.out.println("Constructor method called.");
     }
 
  Language(String t) 
     {
        name = t;
        System.out.println(name);
     }
 
  public static void main(String[] args) 
{
    Language cp  = new Language();
    Language java = new Language("Java");
 
  
}
}

