package lession01;

public class VariableLearning {
    public static void main(String[] args) {
        int myIntNum =18;
        System.out.println("My Variable: "+ myIntNum);
        int a = 1 ;
        int b = 2 ;
        int c = a+b ;
        int d = ++a + b++ ;
        boolean isValue = false;
        isValue = true;
        float myFloatNum =3.0f;
        double myDoubleNum  = 3.0;
        System.out.printf("My Variable: %d %f %f \n", myIntNum,myFloatNum,myDoubleNum);
        boolean isABiggerThanB = a>b;
        boolean reveredBoolean = !isABiggerThanB;

        int e = 4/2; //result: 2
        int f = 4%2; //remaining:0;
        if (isABiggerThanB){
            System.out.println("Let's talk");
        }else{
            System.out.println("byeeeee....");
        }
    }
}
