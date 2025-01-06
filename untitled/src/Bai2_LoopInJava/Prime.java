package Bai2_LoopInJava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " is not Prime Number");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(n + " is Prime Number");
            } else {
                System.out.println(n + " is not Prime Number");
            }
        }
    }
}
