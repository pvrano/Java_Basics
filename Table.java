
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
public class Table {
    private int num;//variable for storing input number
    private int answer;// variable for answer of table
    //getter for answer
    public int getanswer(){
        return this.answer;
    }
    //method for takin input
    public void getInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = Integer.parseInt(in.nextLine());
        this.num = num;
    }
    //method for calculating table
    public void getTable(){
        this.getInput();
        for(int i=1;i<=10;i++){
            answer = num * i; 
            System.out.println( this.num+"*"+i+" = "+this.getanswer());
        }
    }
    public static void main(String args[]){
        Table obj = new Table();
        obj.getTable();
    }
}
