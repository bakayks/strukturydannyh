package com.company;

import java.io.IOException;

public class BBTS {
    public static void main(String[] args){
        TreeNode der = new TreeNode(5);
        der.setLeft(new TreeNode(7));
        der.setRight(new TreeNode(2));

        der.left().setLeft(new TreeNode(9));
        der.right().setRight(new TreeNode(3));
        der.right().right().setRight(new TreeNode(1));

        System.out.println("preorder");
        der.preOrder();
    }
}
