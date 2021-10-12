package lesson06.Baitap;

import java.security.SecureRandom;

public class Animals {
    private  String name;
    protected static String defaultName;
    protected int randomSpeed;
    private int speed;
    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
}
