import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line = br.readLine())!= null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.printf("Tổng = %d", sum);
        }catch (Exception e){
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
