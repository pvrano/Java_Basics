
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *date 14/7/16
 * @author PVRANO
 */
public class Factorize {
    private int num;
    private int factor = 1;
    public int getnum(){
        return this.num;
    }
     public void getInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = Integer.parseInt(in.nextLine());
        this.num = num;
    }
     public void factor(){
         this.getInput();
        
         for(this.getnum() ; num>0;--num){
             factor = factor *num;
         }
         System.out.println("the factor of number is "+this.factor);
     }
     public static void main(String args[]){
         Factorize obj = new Factorize();
         obj.factor();
     }
    
}
