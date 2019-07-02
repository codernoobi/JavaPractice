/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.util.Random;
public class RandomNumbers {
    public static void main(String args[]){
        Random dice=new Random();
        int number;
        for(int i=1;i<=10;i++)
        {
            number=1+dice.nextInt(6);//Starts from ZERO so add 1 to dice...0-5(6)
            System.out.print(number+" ");
        }
    }
}
