package com.bst;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SameBSTTest {

    @Test
    public void isSameBST(){
        SameBST sameBST = new SameBST();
        boolean isSameBST = sameBST.isSameBST(Arrays.asList(10,15,8,12,94,81,5,2,11),Arrays.asList(10,8,5,15,2,12,11,94,81));
        Assert.assertTrue(isSameBST);

    }
}
