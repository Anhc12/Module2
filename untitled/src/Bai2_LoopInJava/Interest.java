package Bai2_LoopInJava;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;//số tiền gửi
        int month = 1;// số tháng gửi
        double interestRate = 1.0; // mức lãi suất
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amoutnt: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter interest rate: ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            double monthlyInterest = money*(interestRate/100)/12;
            totalInterest += monthlyInterest;
            money += monthlyInterest;
        }
        System.out.println("Total interest: " + totalInterest);
    }
}
