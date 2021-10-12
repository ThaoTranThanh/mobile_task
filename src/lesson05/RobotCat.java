package lesson05;

import java.sql.SQLOutput;

public class RobotCat {
    private String name;

    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods | Parameter: set feature | argument: real value
    public void run(){
        System.out.println(" Running...");
    }
    public void runWithSteps(int steps){
        for(int initStep =0; initStep< steps; initStep ++){
            System.out.println("Running at step:" + (initStep+1));
        }
    }
//    @Override
//    public  String toString(){
//       // return " RobotCat{"+ "name =" + name.
//    }
}
