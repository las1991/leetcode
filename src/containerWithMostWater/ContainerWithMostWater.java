package containerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int m = 0, n = height.length - 1;
        int max = 0;
        while (m < n) {
            int h = height[m] < height[n] ? height[m] : height[n];
            if (h * (n - m) > max) {
                max = h * (n - m);
            }
            if (height[m] <= height[n]) m++;
            else n--;
        }
        return max;
    }

}
