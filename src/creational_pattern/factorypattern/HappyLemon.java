package creational_pattern.factorypattern;

public class HappyLemon implements MilkTeaFactory {
    public MilkTea produceMilkTea() {
        return new JellyMilkTea();
    }
}
