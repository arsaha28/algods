package com.bst;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RightSmallerThanTest {

    @Test
    public void rst(){
        List<Integer> array = Arrays.asList(8,5,11,-1,3,4,2);
        RightSmallerThan rightSmallerThan = new RightSmallerThan();
        List<Integer> opArray  = rightSmallerThan.rightSmallerThan(array);
        System.out.println(opArray);
        //TODO:Add assert
    }
}
