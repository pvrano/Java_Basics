
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *date- 14/7/16
 * @author PVRANO
 */
public class AddDigits {
    //declarating global variables for just this class
    private int num ;
    private int v;
    private int new_v;
    
    //method for taking input from user
    public void getInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = Integer.parseInt(in.nextLine());
        this.num = num;
    }
   
    //method for adding digits
    public void addDigits()
    {
       this.getInput();
       while(this.num>0)//while works till condition satisfies
       {
         v = num%10;//modulo returns the remainder(v) which is 5 in first iteration 
         new_v = new_v  + v; //this adds the value of v which is 5 in 1st iteration
         num = num/10; //this operator returns the quotient which is one num less than the previous one
       }
       System.out.println("sum of the digits is"+this.new_v);
    }
    public static void main(String args[]){
        AddDigits obj = new AddDigits();
        obj.addDigits();
    }
}
