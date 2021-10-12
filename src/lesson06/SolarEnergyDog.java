package lesson06;

public class SolarEnergyDog extends RobotDog{
    static {
        defaultName = "SolarEnergyDog";
    }

    public SolarEnergyDog() {
    }

    public SolarEnergyDog(String name) {
        super(name);
    }

    public static String getDefaultName(){
        if(defaultName==null){
            return "Dog";
        }
        return "\nRobot Dog: " + defaultName;
    }
}
