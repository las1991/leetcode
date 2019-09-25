package romanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author las
 */
public class RomanToInteger {
    Map<Character, Integer> map = new HashMap<>();

    {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] tmp = s.toCharArray();
        int sum = 0;
        char last = 'I';
        for (int i = tmp.length - 1; i >= 0; i--) {
            int v = map.get(tmp[i]);
            if (v < sum && tmp[i] != last) sum -= v;
            else {
                sum += v;
                last = tmp[i];
            }
        }
        return sum;
    }
}
