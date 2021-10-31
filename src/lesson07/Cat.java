package lesson07;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
    public void setName()
    {
        this.name = adjustName(name);
    }
    public String adjustName(String name)
    {
        return "Cat: " + name;
    }
}
