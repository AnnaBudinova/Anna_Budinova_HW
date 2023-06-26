package lesson5;
import java.util.Arrays;

public class Homework {
    private static Object MathOperations;

    public static void main(String[] args) {
        sumArray();
    }

    public static void sumArray() {
        int arr[] = {2, 11, 45, 9, 150, 48};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}



