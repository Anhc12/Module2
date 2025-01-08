package Bai2_LoopInJava.BaiTap;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng số nguyên tố cần in ra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khai báo biến count để đếm số lượng số nguyên tố đã tìm thấy
        int count = 0;

        // Bước 3: Khai báo biến N để bắt đầu kiểm tra từ số 2
        int N = 2;

        // Bước 4: Vòng lặp để tìm và in các số nguyên tố
        while (count < numbers) {
            if (isPrime(N)) { // Kiểm tra N có phải là số nguyên tố không
                System.out.println(N); // Nếu đúng, in ra N
                count++; // Tăng số lượng số nguyên tố đã tìm thấy
            }
            N++; // Kiểm tra số tiếp theo
        }
    }

    // Hàm kiểm tra một số có phải là số nguyên tố không
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Số nhỏ hơn 2 không phải số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Kiểm tra từ 2 đến căn bậc 2 của n
            if (n % i == 0) {
                return false; // Nếu chia hết cho i thì không phải số nguyên tố
            }
        }
        return true; // Nếu không chia hết cho số nào thì là số nguyên tố
    }
}
