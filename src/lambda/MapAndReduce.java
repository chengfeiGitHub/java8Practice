package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 最流行的函数编程概念是map，它允许你改变你的对象，在这个案例中，我们将costBeforeTeax集合中每个元素改变了增加一定的数值，
 * 我们将Lambda表达式 x -> x*x传送map()方法，这将应用到stream中所有元素。然后我们使用 forEach() 打印出这个集合的元素.
 */
public class MapAndReduce {
    List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

    /**
     * 改变每个元素的值，并打印
     */
    public void RUN1(){
        costBeforeTax.stream().map((cost) -> cost + .12*cost)
                .forEach(System.out::println);
    }

    /**
     * reduce() 是将集合中所有值结合进一个，Reduce类似SQL语句中的sum(), avg() 或count(),
     */
    public void RUN2 (){
        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost)
                .reduce((sum, cost) -> sum + cost)
                .get();
        System.out.println("Total : " + bill);
    }

    /**
     * 我们经常需要对集合中元素运用一定的功能，如表中的每个元素乘以或除以一个值等等.
     * 下面是将字符串转换为大写，然后使用逗号串起来
     *
     */
    public void RUN3(){
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
}
