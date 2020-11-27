package i454_4Sum_ii;

import java.util.*;

/**
 * @auther: liansheng
 * @Date: 2020/11/27 10:42
 * @Description:
 */
public class FourSum_ii {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> g1 = new HashMap<>();
        Map<Integer, Integer> g2 = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tmp = A[i] + B[j];
                if (g1.containsKey(tmp)) {
                    g1.put(tmp, g1.get(tmp)+1);
                } else {
                    g1.put(tmp, 1);
                }
                tmp = C[i] + D[j];
                if (g2.containsKey(tmp)) {
                    g2.put(tmp, g2.get(tmp)+1);
                } else {
                    g2.put(tmp, 1);
                }
            }
        }
        int count = 0;
        for (Integer left : g1.keySet()) {
            int right = 0 - left;
            if (!g2.containsKey(right)) {
                continue;
            }
            count += g2.get(right) * g1.get(left);
        }
        return count;
    }

    public int fourSumCount1(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> g1 = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tmp = A[i] + B[j];
                if (g1.containsKey(tmp)) {
                    g1.put(tmp, g1.get(tmp) + 1);
                } else {
                    g1.put(tmp, 1);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int right = C[i] + D[j];
                if (g1.containsKey(-right)) {
                    count += g1.get(-right);
                }
            }
        }
        return count;
    }
}
