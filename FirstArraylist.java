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
import java.util.List;
import java.util.ArrayList;
public class FirstArraylist {
    private int ch;
    private Scanner in;
     List<String> name = new ArrayList<String>();
    public int getChoice(){
        return this.ch;
    }
    public void getInputForChoices(){
        System.out.println("Enter your choice");
        in = new Scanner(System.in);
        this.ch = Integer.parseInt(in.nextLine());
    }
    public void displayChoice(){
        
        System.out.println("1.Enter name into arraylist");
        System.out.println("2.Print name from arraylist");
        System.out.println("0.Exit");
        
    }
    public void getNamesInput(){
       // do{
         
        System.out.println("Enter names");
        
        in = new Scanner(System.in);
        String value = in.nextLine();
          name.add(value);
        //}while(!name.equals(name.add("stop")));
    }
    public void printNames(){
        System.out.println("The names you entered are-");
        System.out.println(name);
    }
    public FirstArraylist(){
        do{
        this.displayChoice();
        this.getInputForChoices();
        
        switch(ch){
            case 1 :
            {
                this.getNamesInput();
                
                break;
            }
            case 2 :
            {
                this.printNames();
                break;
            }
            case 0 :
            {
                System.exit(0);
            }
            default:
                System.out.println("wrong choice entered");
                break;
        }
        }while(ch!=0);
    }
    public static void main(String args[]){
        new FirstArraylist();
    }
}
