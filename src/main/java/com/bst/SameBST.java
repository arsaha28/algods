package com.bst;

import java.util.ArrayList;
import java.util.List;

public class SameBST {

    public boolean isSameBST(List<Integer> arrayOne,List<Integer> arrayTwo){
        if(arrayOne.size() != arrayTwo.size()) return false;
        if(arrayOne.size()==0 && arrayTwo.size() ==0) return true;
        if(arrayOne.get(0) != arrayTwo.get(0)) return false;
        List<Integer> smallerOne = smallerThan(arrayOne);
        List<Integer> smallerTwo = smallerThan(arrayTwo);;
        List<Integer> greaterThanEqualOne = greaterThan(arrayOne);
        List<Integer> greaterThanEqualTwo = greaterThan(arrayTwo);
        return  isSameBST(smallerOne,smallerTwo) && isSameBST(greaterThanEqualOne,greaterThanEqualTwo);
    }

    private List<Integer> smallerThan(List<Integer> array){
        List<Integer> smallerElement = new ArrayList<>();
        for(int i= 1;i<array.size();++i){
            if(array.get(i)<array.get(0)){
                smallerElement.add(array.get(i));
            }
        }
        return  smallerElement;
    }

    private List<Integer> greaterThan(List<Integer> array){
        List<Integer> greaterElement = new ArrayList<>();
        for(int i= 1;i<array.size();++i){
            if(array.get(i)>=array.get(0)){
                greaterElement.add(array.get(i));
            }
        }
        return  greaterElement;
    }
}
