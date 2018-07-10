package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 使用Stream的distinct()方法过滤集合中重复元素。
 * 通过复制不同的值创建一个子列表
 */
public class Distinct {

    public void RUN(){
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinctNum = numbers.stream().map(x->x*x).distinct()
                                    .collect(Collectors.toList());
        distinctNum.forEach(System.out::println);
    }
}
