package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class CalculateMinMaxAverage {
    List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

    public void RUN(){
        /**
         * Java的IntSummaryStatistics类如何简单使用？？？
         * 解决问题
         * 这个类主要是和stream类配合使用的，在java.util包中，
         * 主要用于统计整形数组中元素的最大值，最小值，平均值，个数，元素总和等等。下面是一个简单的例子：
         */
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }
}
