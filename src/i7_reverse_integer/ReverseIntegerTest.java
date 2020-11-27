package i7_reverse_integer;

import org.junit.Test;

/**
 * @author las
 * @date 19-7-3
 */
public class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger();

    int test1 = 1;
    int test2 = 123;
    int test3 = -123;
    int test4 = 120;
    int test5 = -120;
    int test6 = 1534236469;
    int test7 = 10;
    int test8 = 102;
    int test9 = 1463847412;

    @Test
    public void reverse() {
        assert 1 == reverseInteger.reverse(test1);
        assert 321 == reverseInteger.reverse(test2);
        assert -321 == reverseInteger.reverse(test3);
        assert 21 == reverseInteger.reverse(test4);
        assert -21 == reverseInteger.reverse(test5);
        assert 0 == reverseInteger.reverse(test6);
        assert 1 == reverseInteger.reverse(test7);
        assert 201 == reverseInteger.reverse(test8);
        assert 2147483641 == reverseInteger.reverse(test9);

    }
}
