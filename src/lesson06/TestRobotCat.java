package lesson06;



public class TestRobotCat {
    public static void main(String[] args) {
        BatteryRobotCat batteryRobotCat = new BatteryRobotCat("BatteryRobotCat","10/03/2021","Pin AAA");
        System.out.println(batteryRobotCat.getName());
        System.out.println(batteryRobotCat.getProductionDate());
        System.out.println(batteryRobotCat.getBatteryType());
        batteryRobotCat.runWithBattery();
        batteryRobotCat.charge();
        System.out.println("\n+++++++++++");


        SolarEnergyRobotCat solarEnergyRobotCat = new SolarEnergyRobotCat("SolarRobotCat","10/03/2021");
        System.out.println(solarEnergyRobotCat.getName());
        System.out.println(solarEnergyRobotCat.getProductionDate());
        solarEnergyRobotCat.runWithSolarEnergy();
        solarEnergyRobotCat.charge();
    }

}
