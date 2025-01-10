public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1,"hoang");
        Student s2 = new Student(2,"khoang");
        Student s3 = new Student(3,"toang");

        s1.display();
        s2.display();
        s3.display();
    }
}
