/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math.*;
import java.util.Scanner;
/**
 *
 * 
 * @author PVRANO
 */
public class MenuOperations 
{
    //DECLARING INSTANCE VARIABLES
    private int num1;
    private int num2;
    private int ch;
    private int result;
    
   //METHOD TO GET THE RESULT OF ANY OPERATION
    public int getResult(){  return this.result;   }
    
   //CONSTRUCTOR
    public MenuOperations(){
        do{
             
             this.displayChoice();
              this.getUserChoice();
             this.getNum();         
             this.operations();
          }while(ch!=0);
       }
    
    //METHOD TO GET TWO NUMBERS OR OPERANDS
    public void getNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of number1 and number2");
        this.num1 = Integer.parseInt(in.nextLine());
        this.num2 = Integer.parseInt(in.nextLine());
       }
    
    //METHOD TO DISPLAY CHOICES TO USER
    public void displayChoice(){    
          System.out.println("1.Add");
          System.out.println("2.Substract");
          System.out.println("3.Multiply");
          System.out.println("4.Absolute");
          System.out.println("5.Greater among two");
          System.out.println("0. EXIT");
       
       }
    
    //METHOD TO GET USER CHOICE AS INPUT
    public void getUserChoice(){
        System.out.println("Choose any one options-");
        Scanner in = new Scanner(System.in);
        this.ch = Integer.parseInt(in.nextLine());
       }
    
    //METHOD TO PERFORM VARIOUS OPERATIONS
    public void operations(){
        
       
        switch(ch){
            case 1 :
                this.result =  this.num1 + this.num2;
               System.out.println("the sum of"+this.num1+" and "+this.num2+"is-"+this.getResult());
               break;
            case 2 :
                this.result = this.num1 - this.num2;
                System.out.println("the difference of"+this.num1+"and"+this.num2+"is-"+this.getResult());
                break;
            case 3 :
                this.result = this.num1 * this.num2;                
                System.out.println("the multiplication of"+this.num1+"and"+this.num2+"is-"+this.getResult());
                break;
            case 4 :                             
                 System.out.println("the absolute value of "+this.num1+" is= "+Math.abs(this.num1));
                 System.out.println("the absolute value of "+this.num2+" is= "+Math.abs(this.num2));
                 break;
            case 5 :
                 System.out.println("the greater value among "+ this.num1+
                 " and "+this.num2+" is- "+ Math.max(this.num1,this.num2));
                break;
            case 0 :
                System.exit (0);
                break;
            default :
                System.out.println("enter a valid number");
                break;
                
            }
        }
    
    public static void main(String args[]){
       
        new MenuOperations();
        }
}
