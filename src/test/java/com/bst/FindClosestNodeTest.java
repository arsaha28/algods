package com.bst;

import org.junit.Assert;
import org.junit.Test;

public class FindClosestNodeTest {

    @Test
    public void testFindClosestNode() {
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
        FindClosestNode findClosestNode = new FindClosestNode();
        int closestNode = findClosestNode.find(16, tree.root);
        Assert.assertEquals(15,closestNode);

    }
}
