package lesson06.Baitap;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger() {
        super(new SecureRandom().nextInt(100));
    }


}
