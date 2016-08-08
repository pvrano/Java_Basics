/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *date is 13/7/16
 * @author PVRANO
 */
public class StringCompare {
    private String name1 = "rano";
    private String name2 = "RANO";
    
    public void compare1(){
        if(name1.equals(name2)){
            System.out.println("both the strings are equal");
        }
        else{
            System.out.println("both the strings are not equal");
        }
    }
    public void compare2(){
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("both the strings are equal");
        }
        else{
            System.out.println("both the strings are not equal");
        }
    }
    
    public static void main(String args[]){
        StringCompare obj = new StringCompare();
        obj.compare1();
        obj.compare2();
    }
    
}
