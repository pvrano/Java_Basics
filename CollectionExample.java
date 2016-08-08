/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PVRANO
 * date 30/7/16
 */
//importing all these classes and interfaces
 import java.util.ArrayList;
 import java.util.List;
 import java.util.HashSet;
 import java.util.Set;
 import java.util.Iterator;
 import java.util.Map;
 import java.util.HashMap;
 
         
public class CollectionExample {
    //creating obj of these classes creating obj of these classes

    List list = new ArrayList();
    Set set = new HashSet();
    Map map = new HashMap();
    
    //method for adding vlues to list
    public void listExample(){
        list.add(22);
        list.add(23);
        list.add("rano");
        list.add("#@%&");
    }
    //method for adding vlaues to hashset
    public void setExample(){
        set.add(123);
        set.add("lala");
        set.add("lala");
        set.add(345);
    }
    //method to set map values with index
    public void mapExample(){
        map.put(1, "priyanka");
        map.put(2, 12345);
        map.put(2, 20.456);
        
    }
    //method to print values
    public void printList(Object obj){
        System.out.println("loop will run"+(list.size())+"times");
        if(obj instanceof List){
            List list = (List)obj;
            for(int i =0; i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
        if(obj instanceof Set){
            Set set = (Set)obj;
            Iterator itr = set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
        if(obj instanceof Map){
            Map map = (Map)obj;
            Iterator itr = map.entrySetiterator();
            while(itr.hasNext()){
                Map.Entry item = (Map.Entry)itr.next();
                System.out.println(item.getKey()+":"+item.getValue());
            }
        }
    }
    public static void main(String[] args){
        CollectionExample c = new CollectionExample();
        c.listExample();
        c.setExample();
        c.mapExample();
        c.printList(c.map);
    }
}
