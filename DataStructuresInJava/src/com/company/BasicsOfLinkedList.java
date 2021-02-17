package com.company;
import java.util.*;
public class BasicsOfLinkedList{

    public static void main(String[] args) {
	    String[] fruits = {"Apple", "Mango", "Orange", "Banana", "Grapes"};

	    List<String> list1 = new LinkedList<String>();
	    for(String fruit: fruits)
	        list1.add(fruit);
        readMe(list1);
	    String[] cities = {"Mumbai", "Pune", "Bangalore", "Jabalpur", "Chennai", "Delhi"};

	    List<String> list2 = new LinkedList<String>();
	    for(String city: cities)
	        list2.add(city);

	    list1.addAll(list2);
        readMe(list1);
        removeItems(list1,2,6);
        readMe(list1);
        reverseMe(list1);
        }


    private static void readMe(List<String> l1) {
        System.out.println(l1);
    }

    private static void removeItems(List<String> l2, int from, int to){
        l2.subList(from,to).clear();
    }

    private static void reverseMe(List<String> l3){
        ListIterator read =  l3.listIterator(l3.size());
        while(read.hasPrevious()){
            System.out.printf("%s",read.previous());
            System.out.println();
        }
    }
}
