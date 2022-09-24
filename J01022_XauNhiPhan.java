import java.util.*;

public class J01022_XauNhiPhan {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fib = new long[95];
    public static void init() {
        fib[1] = fib[2] = 1L;
        for(int i = 3; i < 94; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
    }

    public static char XauNP(int n, long k) {
        if(n == 1) return '0';
        if(n == 2 ) return '1';
        if(k <= fib[n-2]) return XauNP(n-2, k);
        else return XauNP(n-1, k - fib[n-2]);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        init();
        while (t-- > 0)  {
            long k;
            int n = sc.nextInt();
            k = sc.nextLong();
            System.out.println(XauNP(n, k));

        }
    }

}
