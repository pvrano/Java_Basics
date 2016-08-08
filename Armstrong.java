
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */
public class Armstrong {
    private int num;
    private int num4;
     int s=0;int t;
    public void setnum(int num){
        this.num = num;
    }
    public int getnum(){
        return this.num;
    }
    public void setnum4(int num4){
        this.num4 = num4;
    }
    public int getnum4(){
        return this.num4;
    }
    public void getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 100 and 500");
        int num = Integer.parseInt(in.nextLine());
        this.setnum(num);
     }
     
    public void armStrong(){
       
        this.getUserInput();
        this.getnum();
        
        this.setnum4(num);
       while(num>0){
         t = num%10;
         s= s + t*3;
         num = num/10;
       }
       this.getnum4();
        if(s == num4){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }    
    
    public static void main(String args[]){
        Armstrong obj = new Armstrong();
        obj.armStrong();
    }
}