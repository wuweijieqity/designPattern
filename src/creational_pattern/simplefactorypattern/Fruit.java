package creational_pattern.simplefactorypattern;

/**
 * 抽象水果类
 */

public abstract class Fruit {
    /**
     * 水果的口味
     */
    private static String  Taste = "SWEET";

    public void getTaste(){
        System.out.println("水果都是甜的");
    }
    public abstract void fruitColor();

    public abstract void fruitSize();

}
