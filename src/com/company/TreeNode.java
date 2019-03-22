package com.company;

import java.sql.SQLOutput;

public class TreeNode implements BinaryTree {
    private Object element;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Object element){
        this.element = element;
    }

    @Override
    public TreeNode left() {
        return left;
    }

    @Override
    public TreeNode right() {
        return right;
    }

    @Override
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    @Override
    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public Object getElement() {
        return element;
    }

    @Override
    public void setElement(Object element) {
        this.element = element;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void preOrder()
    {
        printPreorderRek(this);
    }
    private void printPreorderRek(BinaryTree node){
        if (node!=null){
            System.out.println(node.getElement());
            printPreorderRek(node.left());
            printPreorderRek(node.right());
        }

    }

    public void inOrder(){

    }

    private void printInorderRek(BinaryTree node){
        if (node!=null){
            if(node!=null){

            }
        }
    }

    public void postOrder(){

    }

    private void printPostorderRek(BinaryTree node){

    }

}
