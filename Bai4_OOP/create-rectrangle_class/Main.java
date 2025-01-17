import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle is \n" + rectangle.display());
        System.out.println("Your perimeter is " + rectangle.getPerimeter());
        System.out.println("Your area is " + rectangle.getArea());
    }
}
