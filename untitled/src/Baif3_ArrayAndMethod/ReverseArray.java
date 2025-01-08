package Baif3_ArrayAndMethod;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Kích thước mảng vượt quá kích thước cho phép");
            }
        }while (size > 20);
        array = new int[size];
        int i =0;
        while (i < array.length) {
            System.out.println("Nhập giá trị các phần tử của mảng "+ (i+1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Phần tử trong mảng: ", "");
        for (int j =0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size-j-1];
            array[size-j-1] = temp;
        }
        System.out.printf("\n%-20s%s", "Mảng đảo ngược: ", "");
        for (int j =0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }
}
