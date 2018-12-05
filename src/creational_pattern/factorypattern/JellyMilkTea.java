package creational_pattern.factorypattern;

public class JellyMilkTea implements MilkTea {
    public void Create() {
        System.out.println("椰果奶茶好了");
    }

    public void createform() {
        System.out.println("椰果奶茶不加奶盖");
    }

    public void createJelly() {
        System.out.println("椰果奶茶加椰果："+JELLY_TYPE_NORMAL);
    }

    public void createBubble() {
        System.out.println("椰果奶茶不加珍珠");
    }
}
