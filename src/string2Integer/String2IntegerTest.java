package string2Integer;

import org.junit.Test;

/**
 * @author las
 * @date 19-7-9
 */
public class String2IntegerTest {
    String2Integer string2Integer = new String2Integer();

    String str1 = "42";
    String str2 = "   -42";
    String str3 = "4193 with words";
    String str4 = "words and 987";
    String str5 = "-91283472332";
    String str6 = "   +0 123";
    String str7 = "2147483648";

    @Test
    public void myAtoi() {
        assert 42 == string2Integer.myAtoi(str1);
        assert -42 == string2Integer.myAtoi(str2);
        assert 4193 == string2Integer.myAtoi(str3);
        assert 0 == string2Integer.myAtoi(str4);
        assert -2147483648 == string2Integer.myAtoi(str5);
        assert 0 == string2Integer.myAtoi(str6);
        assert 2147483647 == string2Integer.myAtoi(str7);
    }
}
