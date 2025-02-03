import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập số hàng của mảng: ");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int cols = sc.nextInt();


        double[][] matrix = new double[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử tại vị trí (%d, %d): ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Mảng 2 chiều vừa nhập:");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


        System.out.println("Nhập thứ tự cột cần tính tổng (bắt đầu từ 0): ");
        int columnIndex = sc.nextInt();


        if (columnIndex < 0 || columnIndex >= cols) {
            System.out.println("Chỉ số cột không hợp lệ.");
        } else {
            // Tính tổng giá trị của cột
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][columnIndex];
            }

            // In kết quả
            System.out.printf("Tổng các phần tử của cột %d là: %.2f\n", columnIndex, sum);
        }
    }
}
