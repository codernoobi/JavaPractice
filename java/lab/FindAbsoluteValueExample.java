/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class FindAbsoluteValueExample {
 
  public static void main(String[] args) {
   
    int i = 8;
    int j = -5;
   
    /*
     * To find absolute value of int, use
     * static int abs(int i) method.
     *
     * It returns the same value if the agrument is non negative value, otherwise
     * negation of the negative value.
     *
     */
   
     System.out.println("Absolute value of " + i + " is :" + Math.abs(i));
     System.out.println("Absolute value of " + j + " is :" + Math.abs(j));
   
     float f1 = 10.40f;
     float f2 = -50.28f;
 
    /*
     * To find absolute value of float, use
     * static float abs(float f) method.
     *
     * It returns the same value if the agrument is non negative value, otherwise
     * negation of the negative value.
     *
     */
    System.out.println("Absolute value of " + f1 + " is :" + Math.abs(f1));
    System.out.println("Absolute value of " + f2 + " is :" + Math.abs(f2));
   
    double d1 = 43.324;
    double d2 = -349.324;
    /*
     * To find absolute value of double, use
     * static double abs(double d) method.
     *
     * It returns the same value if the agrument is non negative value, otherwise
     * negation of the negative value.
     *
     */
    System.out.println("Absolute value of " + d1 + " is :" + Math.abs(d1));
    System.out.println("Absolute value of " + d2 + " is :" + Math.abs(d2));
   
    long l1 = 34;
    long l2 = -439;
    /*
     * To find absolute value of long, use
     * static long abs(long l) method.
     *
     * It returns the same value if the agrument is non negative value, otherwise
     * negation of the negative value.
     *
     */
    System.out.println("Absolute value of " + l1 + " is :" + Math.abs(l1));
    System.out.println("Absolute value of " + l2 + " is :" + Math.abs(l2));
   
  }
}
