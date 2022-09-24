import java.util.Scanner;



class Point {
    private double x, y;

    public Point() {
        this(0,0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.x = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // public double distance(Point secondPoint) {
    //     return sqrt(pow((this.x- secondPoint.x), 2) + pow(this.y - secondPoint.y, 2));
    // }

    // public static double distance(Point p1, Point p2) {
    //     return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
    // }

    double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

}


public class J04001_KhaiBaoLopPoint {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            

            Point pp1 = new Point(a, b);
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            Point pp2 = new Point(c, d);

            System.out.printf("%.4f\n", pp1.distance(pp2));
            
        }
    }
}
