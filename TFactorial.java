/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */import java.util.Scanner;
public class TFactorial {
    int num;
    int factor = 1;
    public int getnum(){
        return this.num;
    }
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = Integer.parseInt(in.nextLine());
        this.num = num;
        
        
    }
    public void factor(){
        this.getInput();
        for(this.getnum(); num>0;--num){
            factor = factor *num;
        }
        System.out.println(this.factor);
    }
    public static void main(String args[]){
        TFactorial obj = new TFactorial();
        obj.factor();
    }
}
