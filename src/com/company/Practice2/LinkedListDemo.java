package com.company.Practice2;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToStart("Apples", 1);
        list.addToStart("Bananas", 2);
        list.addToStart("Lemons", 3);
        System.out.println("Список содержит: "+list.size());

        list.printList();
      /**  if(list.contains("Apples")){
            System.out.println("Список содержит Apples");
        }else{
            System.out.println("Список не содержит Apples");
        }

        list.deleteheadNode();
        list.printList();
       */
    }
}
