package creational_pattern;

import com.ctrip.finance.creditcard.autotest.designPattern.creational_pattern.simplefactorypattern.Apple;
import com.ctrip.finance.creditcard.autotest.designPattern.creational_pattern.simplefactorypattern.Fruit;
import com.ctrip.finance.creditcard.autotest.designPattern.creational_pattern.simplefactorypattern.FruitFactory;

public class Test {
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Fruit fruit;
        fruit = (Apple)FruitFactory.getFruitProduct("Apple");
        fruit.fruitColor();

    }
}
