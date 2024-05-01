package com.bst;

public class MinHeightBST {

    public void construct(BSTree tree,int array[]){
        constructMinHeightBST(tree,array,0,array.length-1);
    }

    private void constructMinHeightBST(BSTree tree,int array[],int startIndex,int endIndex){
        if (endIndex<startIndex){
            return;
        }
        int middleIndex = (startIndex + endIndex)/2;
        tree.insert(array[middleIndex]);
        constructMinHeightBST(tree,array,startIndex,middleIndex-1);
        constructMinHeightBST(tree,array,middleIndex+1,endIndex);
    }
}
