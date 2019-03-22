package com.company.Practice2HomeWork;


import com.company.Practice2.Node;

import java.util.ArrayList;

public class Zadanie3 {
    public static void main(String[] args) {

        //Создаем связный список, последний элемент i не связан
        Node i = new Node("i", null);
        Node h = new Node("h", i);
        Node g = new Node("g", h);
        Node f = new Node("f", g);
        Node e = new Node("e", f);
        Node d = new Node("d", e);
        Node c = new Node("c", d);
        Node b = new Node("b", c);
        Node a= new Node("a", b);

        //связываем последний элемент i
        i.setLink(d);

        Node bakai = a;
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(a);
        while(bakai.getLink()!=null){
            bakai = bakai.getLink();
            if(bakai.getLink() == null){
                System.out.println("Цикла нет");
                return;
            }
            for(int po = 0; po<nodes.size(); po++){
                if(bakai==nodes.get(po)){
                    System.out.println("Цикл есть");
                    return;
                }
            }
            nodes.add(bakai);
        }
    }
}
