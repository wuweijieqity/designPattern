package creational_pattern.AbstractFactoryPattern.concretefactory;

import creational_pattern.AbstractFactoryPattern.ConcreteMilkTea.HappyLemonBubbleMilkTea;
import creational_pattern.AbstractFactoryPattern.ConcreteMilkTea.HappyLemonJellyMilkTea;
import creational_pattern.AbstractFactoryPattern.ConcreteMilkTea.HappyLemonTaroMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.BubbleMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.JellyMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.TaroMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractmilkteafactory.MilkTeaFactory;

/**
 * @author weijie.wu
 * 快乐柠檬咯
 */
public class HappyLemon implements MilkTeaFactory {
    @Override
    public TaroMilkTea makeTaroMilkTea() {
        return new HappyLemonTaroMilkTea();
    }

    @Override
    public JellyMilkTea makeJellyMilkTea() {
        return new HappyLemonJellyMilkTea();
    }

    @Override
    public BubbleMilkTea makeBubbleMilkTea() {
        return new HappyLemonBubbleMilkTea();
    }
}
