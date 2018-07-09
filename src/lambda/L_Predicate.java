package lambda;

/**
 * 为了支持函数编程，Java 8加入了一个新的包java.util.function，
 * 其中有一个接口java.util.function.Predicate是支持Lambda函数编程：
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class L_Predicate {
    List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

    public void Run(){
        System.out.println("Languages which starts with J :");
        filter(languages, (str)->str.startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->str.length() > 4);

    }


    public static void filter(List<String> names, Predicate<String> condition) {
        for(String name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    /**
     * 复杂predicate的使用
     * java.util.function.Predicate提供and(), or() 和 xor()可以进行逻辑操作，
     * 比如为了得到一串字符串中以"J"开头的4个长度
     */
    public void RUN2(){
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;

        languages.stream()
                .filter(startsWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("\nName, which starts with" +
                        " 'J' and four letter long is : " + n));

    }
}
