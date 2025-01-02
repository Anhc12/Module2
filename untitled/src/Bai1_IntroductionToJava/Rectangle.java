package Bai1_IntroductionToJava;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh chiều dài : ");
        float length = sc.nextFloat();
        System.out.print("Nhập cạnh chiều rộng : ");
        float width = sc.nextFloat();
        float area = length * width;
        System.out.println("Diện tích hình chữ nhật là : " + area);
    }
}
