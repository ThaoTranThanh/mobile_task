package lesson02;

public class SwichCaseStatement {
    public static void main(String[] args) {
        int currentDay = 8;
        boolean isDayInRange = currentDay >= 2 && currentDay <= 8;
        if (isDayInRange) {
            switch (currentDay) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Weekdays");
                    break;
                default:
                    System.out.println("Weekend!");
                    break;

            }
        } else {
            System.out.println("Nhap bi sai...");
        }
        System.out.println("Out of Switch statemnt!!");
    }
}
