package lesson05;

import java.util.ArrayList;
import java.util.List;

public class TestRobotCat2 {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat mimi = new RobotCat("mimi");
        robotCatList.add(mimi);
        robotCatList.add(mimi);
        robotCatList.add(mimi);
        for (RobotCat robotCat: robotCatList) {
            System.out.println("Robot Cat name: " + robotCat.getName());

        }
        mimi.setName("meomeo");
        for (RobotCat robotCat : robotCatList){
            System.out.println("Robot Cat name: " + robotCat.getName());
        }
    }
}
