package creational_pattern.factorypattern;

public class BubbleMilkTea implements MilkTea {

    public void Create() {
        System.out.println("珍珠奶茶好了");
    }

    public void createform() {
        System.out.println("珍珠奶茶不加奶盖");
    }

    public void createJelly() {
        System.out.println("珍珠奶茶不加椰果");
    }

    public void createBubble() {
        System.out.println("珍珠奶茶有珍珠: "+BUBBLE_TYPE_BOOM);
    }

}
