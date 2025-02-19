import src.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File myFile = new File("./data.txt");
        Scanner scanner = new Scanner(System.in);
        List<Student> listStudent = new ArrayList<Student>();

        while (true) {
            System.out.println("1: Add new student");
            System.out.println("2: Delete student");
            System.out.println("3: Show list student");
            System.out.println("0: Exit");
            System.out.println("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter code student: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter name student: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter email student: ");
                    String email = scanner.nextLine();
                    // ghi du lieu vao file
                    try {
                        FileWriter fileWriter = new FileWriter(myFile, true);
                        String studentInfo = code + "," + name + "," + email;
                        fileWriter.write(studentInfo);
                        fileWriter.write("\n");
                        fileWriter.close();
                    }catch (IOException e) {
                        System.err.println("Error writing to file: " + e.getMessage());
                    }
                case 3:
                    listStudent.clear();
                    try {
                        FileReader fileReader = new FileReader(myFile);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] studentInfo = line.split(",");
                            Student student = new Student(studentInfo[0], studentInfo[1], studentInfo[2]);
                            listStudent.add(student);
                        }
                        fileReader.close();

                        for (Student student : listStudent) {
                            System.out.println(student.toString());
                        }
                    }catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }

    public static void checkFile(File myFile) throws FileNotFoundException {
        if (!myFile.exists()) {
            throw new FileNotFoundException("File " + myFile.getAbsolutePath());
        }
    }

}
