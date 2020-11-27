package i8_string_to_integer;

/**
 * @author las
 * @date 19-7-9
 */
public class String2Integer {
    public int myAtoi(String str) {
        int result = 0;

        char[] tmp = str.toCharArray();
        boolean hasFlag = false;
        boolean isNagetive = false;
        int i = 0;
        for (; i < tmp.length; i++) {
            if (tmp[i] == ' ' && !hasFlag) {
                continue;
            }
            if ((tmp[i] == '-' || tmp[i] == '+') && !hasFlag) {
                isNagetive = tmp[i] == '-';
                hasFlag = true;
            } else break;
        }

        for (; i < tmp.length; i++) {
            if (tmp[i] <= '9' && tmp[i] >= '0') {
                int x = tmp[i] - '0';
                if (isNagetive) {
                    if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && -x < Integer.MIN_VALUE % 10)) {
                        return Integer.MIN_VALUE;
                    } else {
                        result = result * 10 - x;
                    }
                } else {
                    if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && x > Integer.MAX_VALUE % 10)) {
                        return Integer.MAX_VALUE;
                    } else {
                        result = result * 10 + x;
                    }
                }
                continue;
            } else break;
        }

        return result;
    }
}
