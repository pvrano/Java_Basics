/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */
public class TestArray {

    public TestArray(){
      int[] number = {2,3,4,6,8};
     
    
      for(int i=0; i<number.length;i++)
      {
        System.out.println(number[i]+" ");
      }
    
    }
       public static void main(String args[])
    {
        new TestArray();
    }
}