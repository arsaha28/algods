package com.bst;

public class BSTree {

    Node root = null;

    static class Node{
        int value;
        Node left = null;
        Node right = null;
        public Node(int value){
            this.value = value;
        }
    }

    public Node insert(int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        return insert(value, root);
    }

    private Node insert(int value,Node currentNode){
        if(value< currentNode.value){
            if(currentNode.left == null){
                Node newNode = new Node(value);
                currentNode.left = newNode;
                return newNode;
            }else{
                return insert(value, currentNode.left);
            }
        }else if (value> currentNode.value){
            if(currentNode.right == null){
                Node newNode = new Node(value);
                currentNode.right = newNode;
                return newNode;
            }else {
                return insert(value, currentNode.right);
            }
        }
        return null;
    }

    public int minValue(Node root){
        int min = root.value;
        while(root.left != null){
            min = root.left.value;
            root = root.left;
        }
        return min;
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

}
