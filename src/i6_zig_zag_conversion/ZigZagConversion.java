package i6_zig_zag_conversion;

/**
 * @author las
 * @date 19-6-26
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        int diff = numRows * 2 - 2;
        int row = numRows - 1;
        int col = s.length() / diff + (s.length() % diff == 0 ? -1 : 0);

        char[] chars = s.toCharArray();
        char[] tmp = new char[chars.length];
        int i = 0;
        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <= col; c++) {
                int base = c * diff + r;
                if (base >= chars.length) break;
                tmp[i++] = s.charAt(base);
                if (r != 0 && r != row) {
                    int baseM = base + (row - r) * 2;
                    if (baseM >= chars.length) break;
                    tmp[i++] = s.charAt(baseM);
                }

            }
        }

        String result = new String(tmp);
        System.out.println(result);
        return result;
    }
}
