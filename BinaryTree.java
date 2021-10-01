//package com.sparta.sorterproject;
//
//public class BinaryTree {
//    private class TreeNode {
//        private int value;
//        private com.sparta.sorterproject.BinaryTree.TreeNode leftNode=null;
//        private com.sparta.sorterproject.BinaryTree.TreeNode rightNode=null;
//
//        public TreeNode(int value) {
//            this.value = value;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public void setValue(int value) {
//            this.value = value;
//        }
//
//        public com.sparta.sorterproject.BinaryTree.TreeNode getLeftNode() {
//            return leftNode;
//        }
//
//        public void setLeftNode(com.sparta.sorterproject.BinaryTree.TreeNode leftNode) {
//            this.leftNode = leftNode;
//        }
//
//        public com.sparta.sorterproject.BinaryTree.TreeNode getRightNode() {
//            return rightNode;
//        }
//
//        public void setRightNode(com.sparta.sorterproject.BinaryTree.TreeNode rightNode) {
//            this.rightNode = rightNode;
//        }
//
//        @Override
//        public String toString() {
//            return "TreeNode{" +
//                    "value=" + value +
//                    ", leftNode=" + leftNode +
//                    ", rightNode=" + rightNode +
//                    '}';
//        }
//    }
//    private TreeNode root=null;
//    public void add(int nextValue) {
//        if (root==null){
//            root=new TreeNode(nextValue);
//            return;
//        }
//        if (nextValue>root.getValue()){
//            root.setRightNode(new TreeNode(nextValue));
//            return;
//        }
//        if (nextValue<root.getValue()){
//            root.setLeftNode(new TreeNode(nextValue));
//            return;
//        }
//    }
//}
