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

        return false;
    }

}
