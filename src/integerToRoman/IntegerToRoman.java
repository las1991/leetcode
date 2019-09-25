package integerToRoman;

/**
 * @author las
 */
public class IntegerToRoman {
    //             0     20   1    21   2    42  3  43  4   64 5  65 6
    //             0      1   2    3    4    5   6  7   8   9  10 11 12
    //             M     CM   D    CD   C   XC   L  XL  X   IX V  IV I
    int[] ints = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //               0    1    2   3     4    5    6
    char[] roman = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

    public String intToRoman(int num) {
        if (num == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            while (num >= ints[i]) {
                num -= ints[i];
                if (i % 2 != 0) {
                    sb.append(roman[(i / 4 + 1) * 2]);
                }
                sb.append(roman[i / 2]);
            }
        }
        return sb.toString();
    }
}
