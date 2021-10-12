package lesson05;

public class Calculator {
    public int sum2sum(int num1, int num2){
        return num1 +num2;

    }public int sum3sum(int num1, int num2, int num3){
        return num1 +num2 + num3;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum2sum(1,2));
        System.out.println(calculator.sum3sum(1,2,3));
    }
}
