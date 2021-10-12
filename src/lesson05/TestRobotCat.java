package lesson05;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat robotCat = new RobotCat();
        RobotCat siro = new RobotCat("siro");
        System.out.println("Cat's name: "+ siro.getName());
        siro.setName("Doreamon");
        System.out.println("Cat's name: "+ siro.getName());
        siro.run();
        siro.runWithSteps(4);
        System.out.println(siro);
    }
}
