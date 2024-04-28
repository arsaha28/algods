package com.str;

public class PalindromeCheck {

    public boolean isPalindrome(String str) {
        char [] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j) {
            if (ch[i] != ch[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
