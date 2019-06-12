package medianofTwoSortedArrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int m1 = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1, m2 = length / 2 + 1 - 1;
        int a1 = 0, a2 = 0;
        int i = 0, j = 0;
        for (int x = 0; x < length; x++) {
            if (nums1[i] < nums2[j]) {
                if (i + j == m1) {
                    a1 = nums1[i];
                }
                if (i + j == m2) {
                    a2 = nums1[i];
                }
                i++;
            } else {
                if (i + j == m1) {
                    a1 = nums2[j];
                }
                if (i + j == m2) {
                    a2 = nums2[j];
                }
                j++;
            }
        }
        return ((double) a1 + (double) a2) / 2d;
    }
}
