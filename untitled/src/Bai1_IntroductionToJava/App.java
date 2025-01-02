package Bai1_IntroductionToJava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        int number = 10;
//        int number2 = 20;
//        int sum = number + number2;
//        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Nhap so 1: ");
//        String name = scanner.nextLine();
//        System.out.print("Nhap so 2: ");
//        String name2 = scanner.nextLine();
//        int sum = Integer.parseInt(name) + Integer.parseInt(name2);
//        System.out.println(name + " + " + name2 + " = " + sum);
        //giải phương trình bậc 1
        //b1 lay du lieu
//        System.out.println("Nhập a");
//        int a = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập b");
//        int b = Integer.parseInt(scanner.nextLine());
//        //b2 thuat toan
//        if (a==0){
//            if (b==0){
//                System.out.println("Phuong trinh vo so nghiem");
//            }else {
//                System.out.println("Phuong trinh vo 0");
//            }
//        }else {
//            double x = (double) -b/a;
//            System.out.println("Phuong trinh co nghiem " + x);
//        }
        //btvn viet giai ptb2
        // giai he phuong trinh 2 an
        //ax+by+c=0
        //b1 lấy dữ liệu
        System.out.println("Nhập a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập c");
        int c = Integer.parseInt(scanner.nextLine());

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("Phương trình có nghiem " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x12 = (double) -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép là x = " + x12);
            } else {
                double x1 = (double) -b + Math.sqrt(delta) / (2 * a);
                double x2 = (double) -b - Math.sqrt(delta) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt là x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }
}

