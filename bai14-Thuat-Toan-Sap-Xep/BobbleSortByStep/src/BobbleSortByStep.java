import java.util.Scanner;

public class BobbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập " + arr.length + " phần tử: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập danh sách của bạn: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nBắt đầu xử lý sắp xếp...");
        bobbleSortByStep(arr);
    }

    public static void bobbleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int k = 1; k < arr.length && needNextPass; k++) {

            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Hoán đổi " + arr[i] + " với " + arr[i + 1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Mảng có thể được sắp xếp và không cần lần tiếp theo");
                break;
            }
            System.out.println("Danh sách sau " + k + " bước sắp xếp ");
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
