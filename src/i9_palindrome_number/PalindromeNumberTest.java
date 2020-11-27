package i9_palindrome_number;

import org.junit.Test;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void test1() {
        assert palindromeNumber.isPalindrome(1);
        assert !palindromeNumber.isPalindrome(10);
        assert palindromeNumber.isPalindrome(121);
    }

    @Test
    public void test2(){
        assert palindromeNumber.isPalindrome1(1);
        assert !palindromeNumber.isPalindrome1(10);
        assert palindromeNumber.isPalindrome1(121);
    }

}