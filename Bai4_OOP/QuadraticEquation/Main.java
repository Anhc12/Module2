import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = sc.nextDouble();
        System.out.println("Nhập b");
        double b = sc.nextDouble();
        System.out.println("Nhập c");
        double c = sc.nextDouble();


        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        //tính delta
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm là:");
            System.out.println("Nghiệm 1 = " + equation.getRoot1());
            System.out.println("Nghiệm 2 = " + equation.getRoot2());
        } else if (delta ==0) {
            System.out.println("Phương trình có nghiệm kép là : ");
            System.out.println("Nghiệm 1 = nghệm 2 = " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

