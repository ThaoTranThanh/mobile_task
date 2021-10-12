package lesson06.Baitap;

import java.security.SecureRandom;

public class Dog extends Animals {
    static {
        defaultName = "MiMi";
    }

    @Override
    public  int getSpeed(){
        randomSpeed = new SecureRandom().nextInt(60);
        //System.out.println(randomSpeed);
        return randomSpeed;
    }
    public static String getDefaultName(){
        if(Dog.defaultName==null){
            return "Dog";
        }
        return "Dog name is: " + Dog.defaultName;
    }
}
