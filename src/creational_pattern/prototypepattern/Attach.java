package creational_pattern.prototypepattern;

public class Attach {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public void Disply(){
        System.out.println("奶茶的料子："+name);
    }
}
