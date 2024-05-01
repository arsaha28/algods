package com.bst;

import org.junit.Assert;
import org.junit.Test;

public class MinHeightBSTTest {

    @Test
    public void minHeightBST(){
        MinHeightBST minHeightBST = new MinHeightBST();
        int array[] = new int[]{1,2,5,7,10,13,14,15,22};
        BSTree bsTree = new BSTree();
        minHeightBST.construct(bsTree,array);
        Assert.assertEquals(10, bsTree.root.value);
        bsTree.inorder();
    }
}
