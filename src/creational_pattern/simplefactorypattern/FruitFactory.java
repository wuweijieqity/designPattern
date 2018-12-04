package creational_pattern.simplefactorypattern;

/**
 * 工厂模式的工厂类
 * @author weijie.wu
 */
public class FruitFactory {
    /**
     *
     *工厂模式的核心，静态工厂方法类
     */
    public static Fruit getFruitProduct(Object args){
        Fruit fruit;
        if(args.equals("apple")){
            fruit = new Apple();
        }else if(args.equals("Banana")){
            fruit = new Banana();
        }else {
            fruit = new Orange();
        }
        return fruit;
    }
}
