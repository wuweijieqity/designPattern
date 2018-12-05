package creational_pattern.AbstractFactoryPattern.ConcreteMilkTea;

import creational_pattern.AbstractFactoryPattern.abstractMilkTea.JellyMilkTea;

public class HappyLemonJellyMilkTea implements JellyMilkTea {
    @Override
    public void make() {
        System.out.println("HappyLemonJellyMilkTea");
    }
}
