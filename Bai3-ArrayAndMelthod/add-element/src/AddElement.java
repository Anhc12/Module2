import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập số phần tử của mảng (N): ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Nhập giá trị cần chèn (X): ");
        int x = sc.nextInt();


        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = sc.nextInt();

        // Bước 4: Kiểm tra tính hợp lệ của index
        if (index <= -1 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            // Bước 5: Thực hiện chèn phần tử
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = x;
            for (int i = index; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }

            // Bước 6: In ra mảng
            System.out.print("Mảng trước khi chèn: ");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();

            System.out.print("Mảng sau khi chèn: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        }
    }
}