package Bai2_LoopInJava;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};//* mảng lạc danh

        // tên mảng ; numbers
        // kiểu dữ liệu trong mảng int
        //số phần tử 5
        // add item
        int[] arr = new int[5];
        //số phần tử mảng có thể chứa là 5 ( hiện tại mảng chưa có dl)
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 11;
//         for- each
        for (int item : arr) {
            System.out.println(item);
            // mảng 2 chiều (n chều) là mảng 1 chiều  chứa các phần tử là màng 1 chiều
            int[][] arr2 = new int[5][6];
            // số phần tử mảng arr2 là 5
            //số phẩn từ trong 1 phần tử của mảng là 6
            arr2[0][3] = 8;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
        }

    }
    public static int sum(int a, int b) {
        return a + b;
    }
    //hàm sum có kiểu dũ liệu đầu vào là int có 2 tham số a,b
    //g(x) = x^2 +x +1
}
