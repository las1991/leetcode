package containerWithMostWater;

import org.junit.Test;

/**
 * @author las
 */
public class ContainerWithMostWaterTest {

    int[] array1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    public void test1() {
        assert 49 == container.maxArea(array1);
    }
}