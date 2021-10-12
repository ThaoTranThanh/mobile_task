package lesson06.Baitap;

import java.security.SecureRandom;

public class Horse extends Animals{
    static {
        defaultName = "Hooky";
    }


    @Override
    public  int getSpeed(){
        randomSpeed = new SecureRandom().nextInt(75);
       // System.out.println(randomSpeed);
        return randomSpeed;
    }
    public static String getDefaultName(){
        if(Horse.defaultName==null){
            return "Dog";
        }
        return "Horse name is: " + Horse.defaultName;
    }
}
