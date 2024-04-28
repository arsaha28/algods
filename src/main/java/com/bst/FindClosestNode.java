package com.bst;

public class FindClosestNode {

    public int find(int target,Node root){
        int closest = findClosest(target,root,root.value);
        return closest;
    }

    private int findClosest(int target, Node root, int closest) {
        if(Math.abs(target - closest) > Math.abs(target - root.value)){
            closest = root.value;
        }
        if(null!= root.right && target>root.value){
            return findClosest(target, root.right, closest);
        }else if(null!= root.left && target<root.value){
            return findClosest(target, root.left, closest);
        }else {
            return closest;
        }
    }
}
