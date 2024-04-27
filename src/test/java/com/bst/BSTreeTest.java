package com.bst;

import org.junit.Assert;
import org.junit.Test;

public class BSTreeTest {

    @Test
    public void insertTest(){
        BSTree tree = new BSTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(1);
        tree.insert(15);
        tree.insert(13);
        tree.insert(22);
        tree.insert(12);
        tree.insert(14);
        Assert.assertEquals(10, tree.root.value);
        Assert.assertEquals(1,tree.minValue(tree.root));
        tree.inorder();
    }

    @Test
    public void deleteTest(){
        BSTree tree = new BSTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(1);
        tree.insert(15);
        tree.insert(13);
        tree.insert(22);
        tree.insert(12);
        tree.insert(14);
        tree.inorder();
        tree.delete(10);
        System.out.println("\n");
        tree.inorder();
    }
}
