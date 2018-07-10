package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 通过filtering 创建一个字符串String的集合
 * Filtering是对大型Collection操作的一个通用操作，
 * Stream提供filter()方法，接受一个Predicate对象，意味着你能传送lambda表达式作为一个过滤逻辑进入这个方法：
 */
public class Filter {
    List<String> stringList = Arrays.asList("apple","orange","p0","brana","tea","s");

    public void RUN(){
        List<String> strList = stringList.stream().filter(str->str.length()>2)
                .collect(Collectors.toList());
        strList.forEach(System.out::println);

    }
}
