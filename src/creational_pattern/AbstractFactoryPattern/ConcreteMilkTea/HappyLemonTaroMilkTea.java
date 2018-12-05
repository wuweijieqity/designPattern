package creational_pattern.AbstractFactoryPattern.ConcreteMilkTea;

import creational_pattern.AbstractFactoryPattern.abstractMilkTea.TaroMilkTea;

/**
 * @author weijie.wu
 */
public class HappyLemonTaroMilkTea implements TaroMilkTea {
    @Override
    public void make() {
        System.out.println("HappyLemonTaroMilkTea");
    }
}
