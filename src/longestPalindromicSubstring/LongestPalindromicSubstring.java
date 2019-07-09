package longestPalindromicSubstring;

/**
 * @author las
 * @date 19-6-19
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String result = s;
        char[] tmp = s.toCharArray();
        boolean[][] dp = new boolean[tmp.length][tmp.length];

        int max = 0, start = 0, end = 0;
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (tmp[i] == tmp[j] && (i - j < 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                }
                if (dp[j][i] && max < i - j + 1) {
                    start = j;
                    end = i;
                    max = i - j + 1;
                }
            }
        }

        result = s.substring(start, end + 1);
        System.out.println(result);
        return result;
    }

    public String longestPalindrome1(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String result = s;

        char[] tmp = s.toCharArray();
        boolean[][] dp = new boolean[tmp.length][tmp.length];
        int left=0, right=0, max = 0;
        for (int r = 0; r < tmp.length; r++) {
            for (int l = 0; l <= r; l++) {
                if (tmp[l] == tmp[r] && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                }
                if (dp[l][r] && r - l > max) {
                    left = l;
                    right = r;
                    max = r - l;
                }
            }
        }
        result = s.substring(left, right + 1);
        System.out.println(result);
        return result;
    }

}
