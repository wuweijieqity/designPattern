package creational_pattern.factorypattern;

public class HappyLemon implements MikeTeaFactory {
    public MikeTea produceMilkTea() {
        return new JellyMilkTea();
    }
}
