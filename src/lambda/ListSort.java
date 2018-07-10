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
        apples.forEach(System.out::println);
    }
}
