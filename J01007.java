import java.util.Scanner;

public class J01007 {
    public static Scanner sc = new Scanner (System.in);

    static boolean isFibo(long n) {
        if(n <= 3) return true;
        
        long a = 1, b = 1, c = 0;
        while(c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0) {
            long n  = sc.nextLong();
            if(isFibo(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    
}
