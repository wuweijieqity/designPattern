package creational_pattern.prototypepattern;

public class Client  {
    public static void main(String args[]){
        /**
         * 浅克隆
         */
        MilkTea milkTea = new MilkTea();
        Attach attach = new Attach();
        milkTea.setAttach(attach);
        milkTea.setName("香草");
        milkTea.setTaste("无糖");
        MilkTea milkTeaClone = milkTea.clone();
        System.out.println("======================浅克隆==========================");
        System.out.println("浅克隆奶茶品种："+milkTeaClone.getName());
        System.out.println("浅克隆对象和原来的对象是否是同一个对象："+(milkTea == milkTeaClone));
        System.out.println("浅克隆对象里面的对象是不是原来的对象："+(milkTea.getAttach() == milkTeaClone.getAttach()));
        System.out.println("======================深克隆==========================");
        /**
         * 深克隆
         */

    }
}
