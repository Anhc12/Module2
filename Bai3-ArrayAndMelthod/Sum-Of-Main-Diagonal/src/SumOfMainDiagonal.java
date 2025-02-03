import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập kích thước ma trận vuông (số hàng/cột): ");
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("Ma trận vuông vừa nhập:");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        // In kết quả
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);
    }
}
