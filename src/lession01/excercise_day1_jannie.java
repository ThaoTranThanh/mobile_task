package lession01;

import java.util.Scanner;


public class excercise_day1_jannie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();
        Addition(firstNum,secondNum);
        Subtraction(firstNum,secondNum);
        Multiplication(firstNum,secondNum);
        Division(firstNum,secondNum);
    }
    public static void Addition(int firstNum, int secondNum) {

        int result = firstNum + secondNum;
        System.out.printf("The sum of 2 numbers is %d", result);
        System.out.println();

    }
    public static void Subtraction(int firstNum, int secondNum) {
        int result;
        boolean isGreaterThan = (firstNum > secondNum);
        if(isGreaterThan){
            result = firstNum - secondNum;
        }else{
            result = secondNum - firstNum;
        }
        System.out.printf("The subtraction of 2 numbers is %d", result);
        System.out.println();

    }
    public static void Multiplication(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.printf("The multiplication of 2 numbers is %d", result);
        System.out.println();
    }
    public static void Division(int firstNum, int secondNum) {
        int result;
        boolean isGreaterThan = (firstNum > secondNum);
        if (isGreaterThan) {
            result = firstNum / secondNum;
        } else {
            result = secondNum / firstNum;
        }
        System.out.printf("The division of 2 numbers is %d", result);
    }
}
