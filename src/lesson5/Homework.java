package lesson5;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        isPalindrome();
    }

    public static void sumArray() {
        int arr[] = {2, 11, 45, 9, 150, 48};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
    }

    public static void matrix2d() {
        int[][] arr = new int[4][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        arr[3][0] = 10;
        arr[3][1] = 11;
        arr[3][2] = 12;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void arrayInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int rows = input.nextInt();

        System.out.println("Please enter number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.printf("matrix[%d,%d] = ", row, column);
                matrix[row][column] = input.nextInt();
            }
        }
    }

    public static void biggestNumber() {
        int arr[] = {-500, 15, 32, 42, 55, 500, 122, 132, 150, 180, 400};
        int number = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) number = arr[i];
            System.out.println("The biggest number is : " + number);
        }
    }

    public static void reverseElements() {
        LinkedList<Integer> value = new LinkedList<>();
        value.add(Integer.valueOf(7));
        value.add(Integer.valueOf(10));
        value.add(Integer.valueOf(3));
        value.add(Integer.valueOf(5));

        for (int i = 0; i < value.size() / 2; i++) {
            String temp = String.valueOf(value.get(i));
            value.set(i, value.get(value.size() - i - 1));
            value.set(value.size() - i - 1, Integer.valueOf(temp));
        }
        System.out.println(value);
    }

    public static void sumOfDiagonals() {
        int[][] arr = new int[4][4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;
        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;
        arr[3][0] = 13;
        arr[3][1] = 14;
        arr[3][2] = 15;
        arr[3][3] = 16;
        int sum1 = (arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3]);
        int sum2 = (arr[0][3] + arr[1][2] + arr[2][1] + arr[3][0]);

        System.out.println("The sum of the first diagonal is is: " + sum1);
        System.out.println("The sum of the second diagonal is is: " + sum2);
    }

    public static void isPalindrome(){
        String word = "madam";

        String reveredWord = "";

        boolean isPalindrome = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reveredWord = reveredWord + word.charAt(i);
        }

        if (word.equals(reveredWord)) {
            isPalindrome = true;
        }

        System.out.println("The String is palindrome: " + isPalindrome);
    }
}




