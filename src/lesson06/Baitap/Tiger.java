package lesson06.Baitap;

import java.security.SecureRandom;

public class Tiger extends Animals{
    static {
        defaultName = "Simba";
    }

    @Override
    public  int getSpeed(){
        randomSpeed = new SecureRandom().nextInt(100);
       // System.out.println(randomSpeed);
        return randomSpeed;

    }
    public static String getDefaultName(){
        if(Tiger.defaultName==null){
            return "Tiger";
        }
        return "Tiger name is: " + Tiger.defaultName;
    }
}
