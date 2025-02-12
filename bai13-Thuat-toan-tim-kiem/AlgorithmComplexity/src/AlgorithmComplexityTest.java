import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String inputString = sc.nextLine();
        int[] frequencies = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            frequencies[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < frequencies.length; j++) {
            if (frequencies[j] > max) {
                max = frequencies[j];
                character = (char) j;
            }
        }
        System.out.println("Chữ cái xuất hiện nhiều nhất là: " + character + " với tần số " + max + " lần ");
    }

}
