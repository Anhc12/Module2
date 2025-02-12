import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Nhập giá trị cần tìm: ");
        int value = sc.nextInt();

        int result = binarySearch(array, 0, array.length - 1, value);


        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value);
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result);
        }
    }

    // Bước 3: Hàm tìm kiếm nhị phân đệ quy
    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {//dung vong lap
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }
}
