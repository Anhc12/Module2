package Bai3_ArrayAndMethod.BaiTap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers;
        System.out.println("Enter a size of array : ");
        int size = sc.nextInt();
        numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter value at index  : " + i);
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        sc.close();
        System.out.println("min is = " + min);

    }

}
