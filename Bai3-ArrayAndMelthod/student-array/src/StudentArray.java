import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"hoàng anh", "đoàn", "tùng", "đức", "hiếu", "nghị", "đức anh", "thành", "tú", "đạt"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của sinh viên" + input_name + "trong danh sách là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không có" + input_name + "trong danh sách");
        }
    }
}
