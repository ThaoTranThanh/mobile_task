package lesson06;

import java.beans.beancontext.BeanContext;

public class TestRobotDog {
    public static void main(String[] args) {
       // System.out.println(RobotDog.getDefaultName());
        BatteryDog batteryDog = new BatteryDog("lulu");
        System.out.printf( batteryDog.getDefaultName());

        SolarEnergyDog solarEnergyDog = new SolarEnergyDog("micky");
        System.out.println(solarEnergyDog.getDefaultName());


    }
}
