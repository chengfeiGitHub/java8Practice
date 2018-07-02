package chapter2;

public class AppleGreenColorPredicate implements  ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equals("green"))
            return true;
        else
            return false;
    }
}
