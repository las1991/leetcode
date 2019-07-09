package longestPalindromicSubstring;

import org.junit.Test;

/**
 * @author las
 * @date 19-6-19
 */
public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longest = new LongestPalindromicSubstring();

    String str1 = "babad";
    String str2 = "cbbd";
    String str3 = "ac";
    String str4 = "ccc";
    String str5 = "abadd";
    String str6 = "abcda";
    String str7 = "abacab";
    String str8 = "bananas";

    @Test
    public void longestPalindrome() {
        assert "bab".equals(longest.longestPalindrome(str1)) || "aba".equals(longest.longestPalindrome(str1));
        assert "bb".equals(longest.longestPalindrome(str2));
        assert "a".equals(longest.longestPalindrome(str3));
        assert "ccc".equals(longest.longestPalindrome(str4));
        assert "aba".equals(longest.longestPalindrome(str5));
        assert "a".equals(longest.longestPalindrome(str6));
        assert "bacab".equals(longest.longestPalindrome(str7));
    }

    @Test
    public void test1() {
        assert "bab".equals(longest.longestPalindrome1(str1)) || "aba".equals(longest.longestPalindrome1(str1));
        assert "bb".equals(longest.longestPalindrome1(str2));
        assert "a".equals(longest.longestPalindrome1(str3));
        assert "ccc".equals(longest.longestPalindrome1(str4));
        assert "aba".equals(longest.longestPalindrome1(str5));
        assert "a".equals(longest.longestPalindrome1(str6));
        assert "bacab".equals(longest.longestPalindrome1(str7));
    }
}
