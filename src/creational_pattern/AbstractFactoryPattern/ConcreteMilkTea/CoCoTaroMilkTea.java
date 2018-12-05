package creational_pattern.AbstractFactoryPattern.ConcreteMilkTea;

import creational_pattern.AbstractFactoryPattern.abstractMilkTea.TaroMilkTea;

public class CoCoTaroMilkTea implements TaroMilkTea {
    @Override
    public void make() {
        System.out.println("CoCoTaroMilkTea");
    }
}
