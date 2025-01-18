public class QuadraticEquation {
    private final double a, b, c;


    //Phương thức khởi tạo với 3 tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Phương thức gettter cho a, b và c.
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    //Phương thức tính nghiệm root1 và root2
    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
        }
        return 0;
    }
}
