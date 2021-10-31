package lesson07;


public class BuildHouseTest {
    public static void main(String[] args) {
        // Immutable Object
        House house1 = new House.Builder().hasOngKhoi(true).color("black").build();
        House house2 = new House.Builder().hasOngKhoi(false).color("white").build();
        House house3 = new House.Builder().build();
        house1.buildHouse();
        house2.buildHouse();
        house3.buildHouse();
    }
}
