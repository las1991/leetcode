package longestCommonPrefix;

import org.junit.Test;

/**
 * @author las
 */
public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    String[] str1 = new String[]{"flower", "flow", "flight"};
    String[] str2 = new String[]{"dog","racecar","car"};

    @Test
    public void test() {
        assert "fl".equals(longestCommonPrefix.longestCommonPrefix(str1));
        assert "".equals(longestCommonPrefix.longestCommonPrefix(str2));
    }

}