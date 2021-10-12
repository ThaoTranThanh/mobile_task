package lesson02;

public class excersise_day2_jannie {
    public static void main(String[] args) {
//        // Tinh giai thua
//        int inputNumber= 3;
//        for(int i =0; i<=inputNumber; i++){
//            int giaiThua = i*
//        }
                // Tinh Trung binh cong 1 mang so nguyen
        int [] arrayNumber = new int[3];
        arrayNumber[0] =1;
        arrayNumber[1] =2;
        arrayNumber[2] =3;
        int averageNum = 0;
        int myCurrentArrLegth = arrayNumber.length;
        if(myCurrentArrLegth !=0){
            for(int elementIndex =0;elementIndex<= myCurrentArrLegth; elementIndex++){
                averageNum = (averageNum + arrayNumber[elementIndex])/elementIndex;
                System.out.println("rung bình cong cua "+ elementIndex+ "la: "+ averageNum);
            }

        }else{
            System.out.println("empty list!!!");
        }
    }
}
