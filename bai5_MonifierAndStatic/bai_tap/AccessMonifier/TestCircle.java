package bai_tap.AccessMonifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius" + c1.getRadius());
        System.out.println("Area" + c1.getArea());


        Circle c2 = new Circle(2.5);
        System.out.println("Circle 2:");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
    }
}
