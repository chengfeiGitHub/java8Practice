package lambda;
import static java.util.Comparator.comparing;

import chapter2.Apple;

import java.util.ArrayList;
import java.util.List;

public class ListSort {

    public void RUN(){
        List<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setColor("red");
        apple1.setWeight(120);
        Apple apple2 = new Apple();
        apple2.setColor("green");
        apple2.setWeight(180);
        Apple apple3 = new Apple();
        apple3.setColor("red");
        apple3.setWeight(190);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        //通过lambda表达式自定义排序方式  从小到大
        apples.sort((a1,a2)->a1.getWeight().compareTo(a2.getWeight()));
        //从大到小
      //  apples.sort((a1,a2)->-a1.getWeight().compareTo(a2.getWeight()));
        //或者更简洁的方式
        apples.sort(comparing((apple -> apple.getWeight()) ));
        //逆序
        apples.sort(comparing(Apple::getWeight).reversed());
        /**
         * 但如果发现有两个苹果一样重怎么办？哪个苹果应该排在前面呢？你可能
         * 需要再提供一个Comparator来进一步定义这个比较。比如，在按重量比较两个苹果之后，你可
         * 能想要按原产国排序。thenComparing方法就是做这个用的。它接受一个函数作为参数（就像
         * comparing方法一样），如果两个对象用第一个Comparator比较之后是一样的，就提供第二个
         * Comparator。你又可以优雅地解决这个问题了：
         */
        apples.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        apples.forEach(System.out::println);
    }
}
