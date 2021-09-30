package com.sparta.lp.sortproject.SorterProject;

public class BinaryTree {
    private class TreeNode {
        private int value;
        private com.sparta.lp.sortproject.SorterProject.BinaryTree.TreeNode leftNode=null;
        private com.sparta.lp.sortproject.SorterProject.BinaryTree.TreeNode rightNode=null;

        public TreeNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public com.sparta.lp.sortproject.SorterProject.BinaryTree.TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(com.sparta.lp.sortproject.SorterProject.BinaryTree.TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public com.sparta.lp.sortproject.SorterProject.BinaryTree.TreeNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(com.sparta.lp.sortproject.SorterProject.BinaryTree.TreeNode rightNode) {
            this.rightNode = rightNode;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }
    }
    private TreeNode root=null;
    public void add(int nextValue) {
        if (root==null){
            root=new TreeNode(nextValue);
            return;
        }
        if (nextValue>root.getValue()){
            root.setRightNode(new TreeNode(nextValue));
            return;
        }
        if (nextValue<root.getValue()){
            root.setLeftNode(new TreeNode(nextValue));
            return;
        }
    }
}
