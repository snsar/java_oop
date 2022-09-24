import java.util.Scanner;

public class J01007_KiemTraSoFibonacci {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[96];

    public static void init() {
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < 95; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }
    public static void main(String[] args) {
        init();
        int t = sc.nextInt();
        long n;
        while(t-- > 0) {
            n = sc.nextLong();
        }
    }
}
