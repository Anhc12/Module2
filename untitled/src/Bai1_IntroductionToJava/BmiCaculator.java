package Bai1_IntroductionToJava;

import java.util.Scanner;

public class BmiCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight, BMI ;
        System.out.println("Nhập chiều cao (m) :");
        height = sc.nextDouble();
        System.out.println("Nhập cân nặng (kg) :");
        weight = sc.nextDouble();
        BMI = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "BMI", "Tình trạng\n");
        if (BMI < 18.5) {
            System.out.printf("%-20s%s", BMI, "Bạn quá gầy");
        }else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("%-20s%s", BMI , "Bạn bình thường");
        }else if (BMI >= 25 && BMI <= 29.9) {
            System.out.printf("%-20s%s", BMI , "Bạn thừa cân");
        }else {
            System.out.printf("%-20s%s", BMI , "Bạn đã bị béo phì");
        }
    }
}
