package creational_pattern.factorypattern;

public interface MilkTea {
    public String BUBBLE_TYPE_BOOM = "爆爆珠";
    public String JELLY_TYPE_NORMAL = "椰果";
    //奶盖
    public void createform();
    //椰果
    public void createJelly();
    //珍珠
    public void createBubble();

}
