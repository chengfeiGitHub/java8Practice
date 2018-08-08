package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

    /**
     * ，flatmap方法让你把一个流中的每个值都换成另一个流，然后把所有的流连接
     * 起来成为一个流。
     */
    public void RUN4(){
        List<String> HW = Arrays.asList("Hello","World");
        List<String> uniqueCharacters =
                HW.stream()
                        .map(w -> w.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(Collectors.toList());
        uniqueCharacters.stream().forEach(System.out::println);
    }
    //生成数对
    public void RUN5(){
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i -> numbers2.stream()
                                .map(j -> new int[]{i, j})
                        )
                        .collect(Collectors.toList());

        List<Integer> pairs1 = numbers1.stream()
                            .filter(i-> !numbers2.stream().anyMatch(j->j.equals(i) ))
                            .collect(Collectors.toList());

        pairs1.stream().forEach(System.out::println);
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * reduce操作
     * 使用reduce操作来表达更复杂的查
     * 询，比如“计算菜单中的总卡路里”或“菜单中卡路里最高的菜是哪一个”。此类查询需要将流
     * 返回一个Optional<Dish> 如果包含一个 值就打印它，否 则什么都不做
     * 中所有元素反复结合起来，得到一个值，比如一个Integer。这样的查询可以被归类为归约操作
     * （将流归约成一个值）
     */

    /**
     * 求和操作
     */
    public void RUN6(){
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7);
        //int sum = integers.stream().reduce(0,(a,b)->a+b);
        //或者使用下面这种方法
        int sum = integers.stream().reduce(0,Integer::sum);
        System.out.print(sum);
    }

    /**
     * 求最大最小值
     */
    public void RUN7(){
        List<Integer> numbers = Arrays.asList(1,4,7,3,10,12,32);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        if(max.isPresent()){
            System.out.print(max.get());
        }

    }






}
