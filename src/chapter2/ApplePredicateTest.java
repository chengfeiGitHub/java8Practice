package chapter2;

import java.util.ArrayList;
import java.util.List;

public class ApplePredicateTest {
    public List<Apple> filterApples (List<Apple> appleList, ApplePredicate ap){
        List<Apple> result =  new ArrayList<>();
        for(Apple apple : appleList){
            if(ap.test(apple))
                result.add(apple);
        }
        return result;
    }
}
