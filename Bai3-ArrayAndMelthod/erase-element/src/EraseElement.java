import java.util.Scanner;

public class EraseElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 21, 5, 12, 54, 10, 11, 18};
        System.out.println("Mảng trước khi xóa phần tử:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int x = sc.nextInt();

        //tìm x trong mảng
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < arr.length-1; i++) {

                    arr[i] = arr[i + 1];

            }

            System.out.println("Mảng sau khi xóa phần tử:");
            for (int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i] + " ");
            }
        }else {
            System.out.println("Không có phần tử cần xóa trong mảng");
        }
    }
}
