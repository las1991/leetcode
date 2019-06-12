package medianofTwoSortedArrays;


import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        assert 2 == median.findMedianSortedArrays(nums1, nums2);
    }


    @Test
    public void findMedianSortedArrays1() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        assert 2.5 == median.findMedianSortedArrays(nums1, nums2);
    }
}