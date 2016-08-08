/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 */
public class RemoveSpace {
    private String name = "       hello  world  i   am   good      ";
    public void removeSpace(){
        System.out.println(name);
        System.out.println(name.trim());
    }
    public static void main(String args[]){
        RemoveSpace obj = new RemoveSpace();
        obj.removeSpace();
    }
}
