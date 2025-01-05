package Bai1_IntroductionToJava.BaiTap;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số USD muốn chuyển đổi : ");
        double usd = sc.nextDouble();
        final double rate = 25.424;
        if (usd > 0) {
           double vnd = usd * rate;
           System.out.printf("%.2f USD có già trị là %.2f"  ,usd, vnd);
        }
    }
}
