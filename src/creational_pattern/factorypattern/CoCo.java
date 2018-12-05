package creational_pattern.factorypattern;

public class CoCo implements MilkTeaFactory {
    public BubbleMilkTea produceMilkTea() {
        return new BubbleMilkTea();
    }
}
