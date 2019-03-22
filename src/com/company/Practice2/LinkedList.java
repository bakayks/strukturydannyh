package com.company.Practice2;

public class LinkedList {
    private Node head;
    private Node lastLink;

    public LinkedList(){
        head=new Node();
    }

    public void addToStart(String itemName, int itemCount){
        Node node = head;
        if(node.getLink()!=null){
            node = node.getLink();
        }else{
            node.setLink(new Node(itemName,null));
        }

    }

    public boolean deleteheadNode(){
        if(head.getLink()!=null){
            head = null;
            return true;
        }else{
            head = null;
            return false;
        }
    }

    public int size(){
        Node nodeSchet = head;
        while(nodeSchet.getLink()!=null){
            nodeSchet = nodeSchet.getLink();
            if(nodeSchet.getLink()==null){
                ;
            }
        }
        return 0;
    }

    private Node find(String item){
        Node nodeSchet = head;
        while(nodeSchet.getLink().getItem() != item){
            nodeSchet = nodeSchet.getLink();
            if(nodeSchet.getLink().getLink().getItem() == item){
                return nodeSchet.getLink().getLink();
            }
        }
        return null;
    }

    public boolean contains(String item){
        Node nodeSchet = head;
        while(nodeSchet.getLink().getItem() != item){
            nodeSchet = nodeSchet.getLink();
            if(nodeSchet.getLink().getItem() == item){
                return true;
            }
        }
        return false;
    }

    public void printList(){
        Node schet = head;
        while(schet.getLink()!=null){
            schet = schet.getLink();
            System.out.println(schet.getItem());
        }
    }
}
