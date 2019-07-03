package reverseInteger;

/**
 * @author las
 * @date 19-7-3
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE / 10;
        while (x != 0) {
            int mod = x % 10;
            if (result < max && result > min || (result == max && mod <= 7) || (result == min && mod >= -8)) {
                result *= 10;
                result += mod;
                x = x / 10;
            }else {
                result = 0;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
