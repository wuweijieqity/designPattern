package creational_pattern;

import creational_pattern.AbstractFactoryPattern.abstractMilkTea.BubbleMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.JellyMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.TaroMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractmilkteafactory.MilkTeaFactory;
import creational_pattern.AbstractFactoryPattern.concretefactory.CoCo;
import creational_pattern.simplefactorypattern.Apple;
import creational_pattern.simplefactorypattern.Fruit;
import creational_pattern.simplefactorypattern.FruitFactory;

public class Test {


    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*水果测试类，简单工厂方法
        Fruit fruit;
        fruit = (Apple)FruitFactory.getFruitProduct("Apple");
        fruit.fruitColor();
        */
        //抽象工厂方法
        BubbleMilkTea cocobubbleMilkTea;
        JellyMilkTea jellyMilkTea;
        TaroMilkTea taroMilkTea;
        MilkTeaFactory milkTeaFactory;
        milkTeaFactory = new CoCo();
        cocobubbleMilkTea = milkTeaFactory.makeBubbleMilkTea();
        cocobubbleMilkTea.make();
    }
}
