import java.util.Scanner;

public class LargestAscendingChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kỳ:");
        String input = sc.nextLine();  // Đọc toàn bộ chuỗi người dùng nhập

        if (input.isEmpty()) {
            System.out.println("Chuỗi rỗng. Không có ký tự nào để xử lý.");
            return;
        }

        String result = "" + input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);  // Ký tự hiện tại
            char last = result.charAt(result.length() - 1);  // Ký tự cuối cùng của chuỗi kết quả

            // So sánh theo thứ tự ASCII: nếu current > last, ta thêm current vào result
            if (current > last) {
                result += current;
            }
        }

        System.out.println("Chuỗi tăng dần lớn nhất thu được: " + result);
    }
}
