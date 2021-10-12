package lesson06;

import lesson06.RobotCat;

public class BatteryRobotCat extends RobotCat {
    private String batteryType;

    public BatteryRobotCat() {
    }

    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public BatteryRobotCat(String name, String productionDate, String batteryType) {
        super(name, productionDate);
        this.batteryType = batteryType;
    }

    public void runWithBattery(){
        System.out.println("runWithBattery");
    }

    @Override
    public void charge() {
        super.charge();
        System.out.println("with battery Circuit");
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
}

