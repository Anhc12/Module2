package Bai1_IntroductionToJava;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm bạn muốn kiểm tra : ");
        year = sc.nextInt();

        boolean isLeapYear = false;

        boolean isDuvisibleBy4 = year % 4 == 0;
        if (isDuvisibleBy4) {
            boolean isDuvisibleBy100 = year % 100 == 0;
            if (isDuvisibleBy100) {
                boolean isDuvisibleBy400 = year % 400 == 0;
                if (isDuvisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không là năm nhuận ", year);
        }
    }
}
