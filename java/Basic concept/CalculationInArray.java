/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class CalculationInArray {
  public static void main(String args[]){
      int array[]={1,2,3,4,5,6,7,8,9};
      int sum=0;
      double mul=1;
      for(int i=0;i<array.length;i++)
      {
          sum+=array[i];
          mul*=array[i];
      }
      System.out.println("Sum = "+sum);
      System.out.println("product = "+mul);
  }  
}
