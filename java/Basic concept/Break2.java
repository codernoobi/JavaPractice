/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class Break2 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==3 && j==3)
                {
                    break;
                }
                System.out.println(i+"  "+j);
            }
        }
    }
}
