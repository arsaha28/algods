package com.bst;

import java.util.ArrayList;
import java.util.List;

public class RightSmallerThan {

    public List<Integer> rightSmallerThan(List<Integer> array){
        if(array.size() == 0){
            return new ArrayList<>();
        }
        int lastIndex = array.size() -1;
        SpecialBST bst = new SpecialBST(array.get(lastIndex),lastIndex,0);
        for(int i = array.size()-2;i>=0;--i){
            bst.insertHelper(array.get(i),i,0);
        }
        List<Integer> rightSmallerCounts = new ArrayList<>(array);
        getSmallerCounts(bst,rightSmallerCounts);
        return rightSmallerCounts;
    }

    private void getSmallerCounts(SpecialBST bst, List<Integer> rightSmallerCounts) {
        if(bst == null) return;
        rightSmallerCounts.set(bst.index, bst.numSmallerAtInsertTime);
        getSmallerCounts(bst.left,rightSmallerCounts);
        getSmallerCounts(bst.right,rightSmallerCounts);
    }


    static class SpecialBST{
        int value;
        int index;
        int numSmallerAtInsertTime;
        int leftTreeSize;
        SpecialBST left;
        SpecialBST right;

        public SpecialBST(int value, int index, int numSmallerAtInsertTime) {
            this.value = value;
            this.index = index;
            this.numSmallerAtInsertTime = numSmallerAtInsertTime;
            this.leftTreeSize = 0;
            this.left = null;
            this.right = null;
        }

        public void insertHelper(int value, int index, int numSmallerAtInsertTime){
            if(value<this.value){
                leftTreeSize++;
                if(left == null){
                    left = new SpecialBST(value,index,numSmallerAtInsertTime);
                }else {
                    left.insertHelper(value,index,numSmallerAtInsertTime);
                }
            }else {
                numSmallerAtInsertTime += leftTreeSize;
                if(value>this.value){
                    numSmallerAtInsertTime++;
                }
                if(right == null){
                    right = new SpecialBST(value,index,numSmallerAtInsertTime);
                }else {
                    right.insertHelper(value,index,numSmallerAtInsertTime);
                }
            }

        }
    }
}


