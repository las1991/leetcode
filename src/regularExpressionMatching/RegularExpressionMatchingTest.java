package regularExpressionMatching;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author las
 * @date 19-7-18
 */
public class RegularExpressionMatchingTest {

    RegularExpressionMatching matching = new RegularExpressionMatching();

    Map.Entry<String, String> entry1 = new HashMap.SimpleEntry<String, String>("aa", "a");
    Map.Entry<String, String> entry2 = new HashMap.SimpleEntry<String, String>("aa", "a*");
    Map.Entry<String, String> entry3 = new HashMap.SimpleEntry<String, String>("ab", ".*");
    Map.Entry<String, String> entry4 = new HashMap.SimpleEntry<String, String>("aab", "c*a*b");
    Map.Entry<String, String> entry5 = new HashMap.SimpleEntry<String, String>("mississippi", "mis*is*p*.");

    @Test
    public void recursion() {
        assert false == matching.isMatch(entry1.getKey(), entry1.getValue());
        assert true == matching.isMatch(entry2.getKey(), entry2.getValue());
        assert true == matching.isMatch(entry3.getKey(), entry3.getValue());
        assert true == matching.isMatch(entry4.getKey(), entry4.getValue());
        assert false == matching.isMatch(entry5.getKey(), entry5.getValue());
    }

    @Test
    public void dp() {
        assert false == matching.isMatchDP(entry1.getKey(), entry1.getValue());
        assert true == matching.isMatchDP(entry2.getKey(), entry2.getValue());
        assert true == matching.isMatchDP(entry3.getKey(), entry3.getValue());
        assert true == matching.isMatchDP(entry4.getKey(), entry4.getValue());
        assert false == matching.isMatchDP(entry5.getKey(), entry5.getValue());
    }


}
