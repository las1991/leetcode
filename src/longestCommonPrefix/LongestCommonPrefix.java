package longestCommonPrefix;

/**
 * @author las
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String tmp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(tmp) != 0) {
                tmp = tmp.substring(0, tmp.length() - 1);
                if (tmp.isEmpty()) return tmp;
            }
        }
        return tmp;
    }
}
