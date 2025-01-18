//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tạo đối tượng fan1
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        // tạo đối tượng fan2
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setColor("blue");
        fan2.setRadius(5);

        //hiển thị thông tin các đối tượng quạt
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}