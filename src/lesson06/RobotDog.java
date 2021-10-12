package lesson06;

public class RobotDog {
    private String name;
    protected static String defaultName ;

    public RobotDog() {
    }

    public RobotDog(String name) {

    }


//class method
    public static String getDefaultName(){
        if(defaultName==null){
            return "Dog";
        }
        return "Robot Dog: " + defaultName;
    }

}
