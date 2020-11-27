package i454_4Sum_ii;


import org.junit.Test;


/**
 * @auther: liansheng
 * @Date: 2020/11/27 11:34
 * @Description:
 */
public class FourSum_iiTest {

    @Test
    public void fourSumCount() {
        int count = new FourSum_ii().fourSumCount(new int[]{1,2}, new int[]{-2,-1}, new int[]{-1,2}, new int[]{0,2});
        assert count == 2;
    }
}