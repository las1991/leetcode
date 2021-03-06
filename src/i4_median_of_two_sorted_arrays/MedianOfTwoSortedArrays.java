package i4_median_of_two_sorted_arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int index1 = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1, index2 = length / 2 + 1 - 1;
        int m1 = 0, m2 = 0;
        int i = 0, j = 0;
        for (int x = 0; x < length; x++) {
            if (i < nums1.length && j < nums2.length && nums1[i] < nums2[j]) {
                if (x == index1) {
                    m1 = nums1[i];
                }
                if (x == index2) {
                    m2 = nums1[i];
                }
                if (i < nums1.length) i++;
            } else if (i < nums1.length && j < nums2.length) {
                if (x == index1) {
                    m1 = nums2[j];
                }
                if (x == index2) {
                    m2 = nums2[j];
                }
                if (j < nums2.length) j++;
            } else if (i < nums1.length) {
                if (x == index1) {
                    m1 = nums1[i];
                }
                if (x == index2) {
                    m2 = nums1[i];
                }
                if (i < nums1.length) i++;
            }else if (j<nums2.length){
                if (x == index1) {
                    m1 = nums2[j];
                }
                if (x == index2) {
                    m2 = nums2[j];
                }
                if (j < nums2.length) j++;
            }
        }
        return ((double) m1 + (double) m2) / 2.0;
    }

    public double findMedianSortedArrays1(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
