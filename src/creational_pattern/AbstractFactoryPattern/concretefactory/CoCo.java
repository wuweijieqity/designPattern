package creational_pattern.AbstractFactoryPattern.concretefactory;

import creational_pattern.AbstractFactoryPattern.ConcreteMilkTea.CoCoBubbleMilkTea;
import creational_pattern.AbstractFactoryPattern.ConcreteMilkTea.CoCoJellyMilkTea;
import creational_pattern.AbstractFactoryPattern.ConcreteMilkTea.CoCoTaroMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.BubbleMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.JellyMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.TaroMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractmilkteafactory.MilkTeaFactory;

/**
 * @author weijie.wu
 * coco
 */
public class CoCo implements MilkTeaFactory {
    @Override
    public TaroMilkTea makeTaroMilkTea() {
        return new CoCoTaroMilkTea();
    }

    @Override
    public JellyMilkTea makeJellyMilkTea() {
        return new CoCoJellyMilkTea();
    }

    @Override
    public BubbleMilkTea makeBubbleMilkTea() {
        return new CoCoBubbleMilkTea();
    }
}
