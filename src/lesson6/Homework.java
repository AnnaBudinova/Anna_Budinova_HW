package lesson6;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int number = averageNumber(10,5,15);
        int number1 = findSmallestNumber(6,-5,4);
        System.out.println(number);
        System.out.println(number1);

    }

      static int findSmallestNumber(int num1, int num2, int num3) {
        int smallestNumber = num1;

        if (smallestNumber > num2) {
            smallestNumber = num2;
        }

        if (smallestNumber > num3) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }

     public static int averageNumber(int num1, int num2, int num3) {
        return  (num1 + num2 + num3) / 3;
    }
}
