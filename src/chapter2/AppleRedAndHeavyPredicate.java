package chapter2;

public class AppleRedAndHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red") && apple.getWeight()>150 ;
    }
}
