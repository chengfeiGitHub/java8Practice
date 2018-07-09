package lambda;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * 根据数组内字符串的长度排序
 */
public class L1 {
    public void SortStringList(String [] stringArray) {
        //由长到短排序
        Arrays.sort(stringArray,(String s1, String s2) -> (s1.length() - s2.length() ) );

        //由短到长排序
        Arrays.sort(stringArray,(String s1, String s2) -> -(s1.length() - s2.length() ) );
    }
}
