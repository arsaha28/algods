package com.bst;

public class ValidateBST {

    public boolean validate(Node root){
        return  validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validate(Node root, int minValue, int maxValue) {
        if(root == null){
            return  true;
        }
        if(root.value<minValue || root.value>=maxValue){
            return false;
        }
        boolean isLeftTreeValid = validate(root.left, minValue, root.value);
        boolean isRightTreeValid = validate(root.right, root.value, maxValue);
        return isLeftTreeValid && isRightTreeValid;
    }
}
