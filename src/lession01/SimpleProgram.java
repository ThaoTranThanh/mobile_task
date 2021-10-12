package lession01;

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputNum = scanner.nextInt();
        boolean isEvenNumber = (inputNum % 2 == 0);
        if (isEvenNumber){
            System.out.printf("The number %d is even number.\n",inputNum);
        }else {
            System.out.printf("The number is odd number.\n",inputNum);
        }
        System.out.println("See you next time! ");
    }
}
