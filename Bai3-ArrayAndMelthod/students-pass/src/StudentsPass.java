import java.util.Scanner;

public class StudentsPass {
    public static void main(String[] args) {


        int size;
        int[] studentsPoint;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng điểm sinh viên: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Kích thước không thể vượt quá 30!");

            }
        } while (size > 30);

        studentsPoint = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Nhập điểm sinh viên số " + (i + 1) + ": ");
            studentsPoint[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm sinh viên : ");
        for (i = 0; i < studentsPoint.length; i++) {
            System.out.print(studentsPoint[i] + "\t");
            if (studentsPoint[i] >= 5 && studentsPoint[i] <= 10) {
                count++;
            }
        }
        System.out.println("Số sinh viên vượt qua kì thi là : " + count);
    }
}
