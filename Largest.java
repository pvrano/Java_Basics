/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */
public class Largest {
    
    int[] arri = {34,45,63,89,48,10};
    int largest = arri[0];
    int smallest = arri[0];
    public  Largest(){
    for(int i=1; i< arri.length; i++){
         if(arri[i]>largest){
             largest = arri[i];
         }
         else if(arri[i]<smallest){
             smallest = arri[i];      
         }
}
    System.out.println("largest number is "+largest);
    System.out.println("smallest number is "+smallest);
    
}
    public static void main(String args[]){
        new Largest();
    }
}
