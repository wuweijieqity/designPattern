package creational_pattern.AbstractFactoryPattern.abstractmilkteafactory;

import creational_pattern.AbstractFactoryPattern.abstractMilkTea.BubbleMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.JellyMilkTea;
import creational_pattern.AbstractFactoryPattern.abstractMilkTea.TaroMilkTea;

/**
 * @author weijie.wu
 * 奶茶应该最起码要有这些奶茶啦，不然开着有什么用
 */
public interface MilkTeaFactory {
    public TaroMilkTea makeTaroMilkTea();
    public JellyMilkTea makeJellyMilkTea();
    public BubbleMilkTea makeBubbleMilkTea();
}
