package com.company;

interface BinaryTree {
    public TreeNode left();
    public TreeNode right();
    public void setLeft(TreeNode left);
    public void setRight(TreeNode right);
    public Object getElement();
    public void setElement(Object element);
}
