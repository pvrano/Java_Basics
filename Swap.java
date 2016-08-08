/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */
public class Swap {
    
    private int x = 5;
    private int y = 3;
    
    public void swap(){
    
        System.out.println("value of x before swap is "+x);
        System.out.println("value of y before swap is "+y);
    
        //int temp;
       // temp = x;
       // x = y;
       // y = temp;
       x = x+y;
       y = x-y;
       x = x-y;
        
        System.out.println("new value of x is "+x);
        System.out.println("new value of y is "+y);
        
    }
    public static void main(String args[]){
        Swap obj = new Swap();
        obj.swap();
    }
}
