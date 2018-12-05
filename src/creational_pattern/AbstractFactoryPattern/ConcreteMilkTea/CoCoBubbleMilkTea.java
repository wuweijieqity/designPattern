package creational_pattern.AbstractFactoryPattern.ConcreteMilkTea;

import creational_pattern.AbstractFactoryPattern.abstractMilkTea.BubbleMilkTea;

public class CoCoBubbleMilkTea implements BubbleMilkTea {
    @Override
    public void make() {
        System.out.println("CoCoBubbleMilkTea");
    }
}
