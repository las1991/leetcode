package regularExpressionMatching;

/**
 * @author las
 * @date 19-7-17
 */
public class RegularExpressionMatching {

    public boolean isMatch(String text, String pattern) {

        if (pattern.isEmpty()) return text.isEmpty();

        boolean first_match = !text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.');

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }


    public boolean isMatchDP(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();

        int[][] dp = new int[text.length() + 1][pattern.length() + 1];

        return dp(dp, 0, 0, text, pattern);
    }

    private boolean dp(int[][] dp, int i, int j, String text, String pattern) {
        boolean ans;
        if (j == pattern.length()) return i == text.length();
        if (dp[i][j] != 0) {
            return dp[i][j] == 1;
        }

        boolean first_match = i < text.length() && (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.');

        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
            ans = (first_match && dp(dp, i + 1, j, text, pattern)) || dp(dp, i, j + 2, text, pattern);
        } else {
            ans = first_match && dp(dp, i + 1, j + 1, text, pattern);
        }
        dp[i][j] = ans ? 1 : -1;
        return ans;
    }

}
