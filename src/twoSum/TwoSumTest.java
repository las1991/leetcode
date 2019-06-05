package twoSum;


import org.junit.Test;

import java.util.Arrays;

/**
 * @author las
 * @date 19-6-5
 */
public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void twoSumBruteForce() {
        System.out.println(Arrays.toString(twoSum.twoSumBruteForce(new int[]{3, 2, 4}, 6)));
    }

    @Test
    public void twoSumTwoPassHashTable() {
    }

    @Test
    public void twoSumOnePassHashTable() {
    }
}
