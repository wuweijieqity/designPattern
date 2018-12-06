package creational_pattern.prototypepattern;

public class MilkTea implements Cloneable{
    private Attach attach;
    private String name;
    private String taste;

    public Attach getAttach() {
        return attach;
    }

    public void setAttach(Attach attach) {
        this.attach = attach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public MilkTea clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("浅克隆失败");
        }
        return (MilkTea) object;

    }

}
