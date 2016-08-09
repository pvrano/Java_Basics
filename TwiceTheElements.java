/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */
import java.util.Scanner;
public class TwiceTheElements {
    private Scanner in;
    private int[] array;
    private int size;
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public int[] getArray(){
        return this.array; 
    }
    public void inputSize(int size){
        in = new Scanner(System.in);
    System.out.println("Enter the size of array");
        size = Integer.parseInt(in.nextLine());
        this.setSize(size);
    }
    public void getArrayInput(int[] array){
         in = new Scanner(System.in);         
        System.out.println("Enter the elements in array");
         array = new int[this.getSize()];
        for(int i=0 ; i<this.size; i++){
            int value = Integer.parseInt(in.nextLine());
            array[i]= value;
        }
        this.array = array;
    }
    public void displayArray(int[] array){
       System.out.println("The array you entered is-");
        for(int i=0; i<this.array.length;i++){
            System.out.println(array[i]);
        }
    }
    public void doubleArray(int[] m){
      for(int i=0;i<m.length;i++){
           m[i]= m[i]*2;
             
       }   
       
    }
    public void twiceElements(){
        doubleArray(array);
       for(int i=0;i<array.length;i++){
        System.out.println("the doubled value of each array element is= "+array[i]);
        }
   }
    public TwiceTheElements(){
        this.inputSize(size);
        this.getArrayInput(array);
        this.displayArray(this.getArray());
        this.twiceElements();
       
    }
    public static void main(String[] args){
        new TwiceTheElements();
    }
}
