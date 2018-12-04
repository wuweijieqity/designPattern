package creational_pattern.factorypattern;

public class CoCo implements MikeTeaFactory {
    public BubbleMilkTea produceMilkTea() {
        return new BubbleMilkTea();
    }
}
