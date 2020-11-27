package i9_palindrome_number;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] tmp = String.valueOf(x).toCharArray();
        if (tmp.length <= 1) {
            return true;
        }
        int mid = (tmp.length + 1) / 2;
        int length = tmp.length - 1;
        for (int i = 0; i < mid; i++) {
            if (tmp[i] != tmp[length - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int left = 0;
        while (x > left) {
            left = left * 10 + x % 10;
            x = x / 10;
        }
        return x == left || x == left / 10;
    }
}
