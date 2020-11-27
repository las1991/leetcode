package i4_median_of_two_sorted_arrays;


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
        assert 2.5 == median.findMedianSortedArrays1(nums1, nums2);
    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};
        assert 1 == median.findMedianSortedArrays(nums1, nums2);
        assert 1 == median.findMedianSortedArrays1(nums1, nums2);
    }

    @Test
    public void findMedianSortedArrays3() {
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{};
        assert 2 == median.findMedianSortedArrays(nums1, nums2);
        assert 2 == median.findMedianSortedArrays1(nums1, nums2);
    }
}
