/*
 * To change this license header, choose License Headers in Project Properties.
 * created on 11/7/16
 * and open the template in the editor.
 

/**
 *
 * @author PVRANO
 */
public class RoomArea {
    Room obj;
    public RoomArea(){
        double area;
        Room obj = new Room();
        obj.getData(45, 33);
        area = obj.length * obj.breadth;
        System.out.println("area of room is"+area);
    }
    public static void main(String args[]){
     new RoomArea();   
    }
}
