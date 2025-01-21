import java.util.Scanner;

public class PlusArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng một: ");
        int a = sc.nextInt();
        int[] arrayOne = new int[a];


        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng một : ");
            arrayOne[i] = sc.nextInt();
        }
        System.out.println("Nhập độ dài của mảng hai: ");
        int b = sc.nextInt();
        int[] arrayTwo = new int[b];
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng hai: ");
            arrayTwo[i] = sc.nextInt();
        }

        int[] arrayThree = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayThree[i] = arrayOne[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayThree[arrayOne.length +i] = arrayTwo[i];
        }
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i] + " ");
        }
    }

}
