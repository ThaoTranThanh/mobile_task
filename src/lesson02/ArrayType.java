package lesson02;

public class ArrayType {
    public static void main(String[] args) {
        //String [] student= new String[10];
        int[] myIntArray = new int[5];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;
        int myCurrentArrLegth = myIntArray.length;
        if (myCurrentArrLegth != 0) {
            for (int elementIndex = 0; elementIndex < myCurrentArrLegth; elementIndex++)
                System.out.println("Item: " + myIntArray[elementIndex] + "\n");
        } else {
            System.out.println("Empty array!");
        }
// Reassign element values
        for (int elementIndex = 0; elementIndex < myCurrentArrLegth; elementIndex++) {
            myIntArray[elementIndex] = (myIntArray[elementIndex] * 2);
        }
        if (myCurrentArrLegth != 0) {
            for (int elementIndex = 0; elementIndex < myCurrentArrLegth; elementIndex++) {
                System.out.println("re-print items:" + myIntArray[elementIndex] +"\n");
            }

        }else {
            System.out.println("Empty array!");
        }
    }
}
