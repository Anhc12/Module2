package Bai1_IntroductionToJava.BaiTap;

import java.util.Scanner;

public class GioiThieuTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Hãy nhập Tên của bạn");
        name = sc.nextLine();
        System.out.println("Xin chào " + name);
    }
}
