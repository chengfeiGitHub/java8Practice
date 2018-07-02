package chapter2;

public class AppleHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight()>150)
            return true;
        else
            return false;
    }
}
