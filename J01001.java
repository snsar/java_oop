import java.util.Scanner;

public class J01001 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        int length = sc.nextInt();
        int width = sc.nextInt();
        if (length <= 0 || width <= 0) {
            System.out.print("0");
        }
        else {
            int area = length * width;
            int perimeter = (width + length) * 2;
            System.out.printf("%d %d", perimeter, area);

        }
        sc.close();
    }

}
