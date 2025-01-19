import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Kích thước của mảng phải nhỏ hơn 20.");
            }
        } while (size > 20);
        array = new int[size];
        int k = 0;
        while (k < size) {
            System.out.println("Nhập giá trị phần từ thứ " + (k + 1) + " : ");
            array[k] = sc.nextInt();
            k++;
        }

        System.out.println("Danh sách phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là "+ max+", vị trí "+index);
    }

}
