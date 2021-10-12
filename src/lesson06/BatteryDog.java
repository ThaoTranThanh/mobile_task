package lesson06;

public class BatteryDog extends RobotDog{

    static {
        defaultName = "BatteryDog";
    }
    public BatteryDog() {
    }

    public BatteryDog(String name) {
        super(name);
    }
    public static String getDefaultName(){
        if(defaultName==null){
            return "Dog";
        }
        return "Robot Dog: " + defaultName;
    }
}
