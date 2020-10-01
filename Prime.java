/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *16/7/16
 * @author PVRANO
 */
import java.util.Scanner;
public class Prime {
    //variable 
    int num;
    //setter 
    public void setnum(int num){
        this.num = num;
    }
   
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime");
        int num = Integer.parseInt(in.nextLine());
        this.setnum(num);
        
    }
    public void getPrime(){
        this.getInput();
        if(num==0)
            System.out.println("number is neither prime or not prime");
        else if(num==1)
            System.out.println("number is not prime");
        else
        for(int i =2; i<num; i++){
            //if remainder comes to be zero then not prime
            if(num%i==0){
                System.out.println("number is not prime");
                break;
            }
            //else num is prime as it is not divisible by any number past it
            else{
                System.out.println("number is prime");
                break;
            }
            
        }
        
        
    }
    public static void main(String args[]){
        Prime obj = new Prime();
        obj.getPrime();
    }
}
