package Bai2_LoopInJava.BaiTap;

public class Show100Prime {
    public static void main(String[] args) {
        int N = 100;
        System.out.println("Các số nguyên tố nhỏ hơn ");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
