package zigZagConversion;

import org.junit.Test;

/**
 * @author las
 * @date 19-6-26
 */
public class ZigZagConversionTest {

    ZigZagConversion zigZag = new ZigZagConversion();

    String str = "PAYPALISHIRING";
    int numRow1 = 2;
    int numRow2 = 3;
    int numRow3 = 4;
    int numRow4 = 5;


    @Test
    public void convert() {
        assert "PYAIHRNAPLSIIG".equals(zigZag.convert(str, numRow1));
        assert "PINALSIGYAHRPI".equals(zigZag.convert(str, numRow2));
        assert "PHASIYIRPLIGAN".equals(zigZag.convert(str, numRow3));
        assert "PHASIYIRPLIGAN".equals(zigZag.convert(str, numRow4));
    }
}
