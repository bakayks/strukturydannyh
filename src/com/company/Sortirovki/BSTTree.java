package com.company.Sortirovki;

public class BSTTree {
    BstNode rootNode;
    public BSTTree(int i){
        rootNode = new BstNode(i);
    }

    public void addNode(int i){
        if(rootNode.toString() == null){
            rootNode.setIntData(i);
        }else{
            rootNode.poiskNull(i);
        }
    }

    public void treverseAndPrint(BstNode i){
            if(i != null){
                treverseAndPrint(i.leftNode);
                System.out.println(i.getIntData());
                treverseAndPrint(i.rightNode);
            }
    }
}
