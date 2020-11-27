package i12_integer_to_roman;

import org.junit.Test;

/**
 * @author las
 */
public class IntegerToRomanTest {

    IntegerToRoman toRoman=new IntegerToRoman();


    @Test
    public void test(){
        assert "III".equals(toRoman.intToRoman(3));
        assert "IV".equals(toRoman.intToRoman(4));
        assert "IX".equals(toRoman.intToRoman(9));
        assert "LVIII".equals(toRoman.intToRoman(58));
        assert "MCMXCIV".equals(toRoman.intToRoman(1994));
    }

}