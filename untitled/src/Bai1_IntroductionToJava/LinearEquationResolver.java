package Bai1_IntroductionToJava;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        //giải phương trình bậc 1
        //b1 lay du lieu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập b");
        int b = Integer.parseInt(scanner.nextLine());
        //b2 thuat toan
        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo 0");
            }
        }else {
            double x = (double) -b/a;
            System.out.println("Phuong trinh co nghiem " + x);
        }
    }


}
