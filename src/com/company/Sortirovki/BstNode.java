package com.company.Sortirovki;

public class BstNode {
    public int intData;
    public BstNode leftNode;
    public BstNode rightNode;
     public BstNode(int i){
        poiskNull(i);
     }

     public void poiskNull(int i){
         if(i<intData){
             if(leftNode.getLeftNode() == null){
                 leftNode.setIntData(i);
             }else{
                 leftNode.poiskNull(i);
             }
         }
         if(i>intData){
             if(leftNode.getLeftNode() == null){
                 leftNode.setIntData(i);
             }else{
                 leftNode.poiskNull(i);
             }
         }
     }


    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public void setLeftNode(BstNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(BstNode rightNode) {
        this.rightNode = rightNode;
    }

    public BstNode getLeftNode() {
        return leftNode;
    }

    public BstNode getRightNode() {
        return rightNode;
    }
}
