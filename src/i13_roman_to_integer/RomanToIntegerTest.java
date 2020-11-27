package i13_roman_to_integer;

import org.junit.Test;

/**
 * @author las
 */
public class RomanToIntegerTest {

    RomanToInteger toInteger=new RomanToInteger();

    @Test
    public void test(){
        assert 3==toInteger.romanToInt("III");
        assert 4==toInteger.romanToInt("IV");
        assert 9==toInteger.romanToInt("IX");
        assert 58==toInteger.romanToInt("LVIII");
        assert 1994==toInteger.romanToInt("MCMXCIV");
    }

}