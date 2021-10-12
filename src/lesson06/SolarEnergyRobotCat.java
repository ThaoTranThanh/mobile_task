package lesson06;

public class SolarEnergyRobotCat extends RobotCat{
    public SolarEnergyRobotCat() {
    }

    public SolarEnergyRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public void runWithSolarEnergy(){
        System.out.println("runWithSolarEnergy");
    }
    @Override
    public void charge() {
        super.charge();
        System.out.println("with solar energy Circuit");
    }
}
