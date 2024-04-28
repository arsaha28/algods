package com.str;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckTest {

    @Test
    public void isPalindrome() {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        Assert.assertTrue(palindromeCheck.isPalindrome("abba"));
        Assert.assertTrue(palindromeCheck.isPalindrome("a"));
        Assert.assertTrue(palindromeCheck.isPalindrome("aba"));
        Assert.assertTrue(!palindromeCheck.isPalindrome("abcdecba"));

    }
}
