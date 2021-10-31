package lesson06.Baitap;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog() {
        super(new SecureRandom().nextInt(60));
    }


}
