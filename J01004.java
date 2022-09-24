import java.util.Scanner;

public class J01004 {
    public static boolean isPrime(long n) {
        if(n <= 1 ) return false;
        if(n == 2 || n == 3 ) return true;

        if( n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i <= Math.sqrt(n); i += 6) {
            if(n % i == 0 || n % (i+2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long n;
        while(T > 0) {
            n = sc.nextLong();
            if(isPrime(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            T--;
        }

    }
}

//3
//123456
//997
//111111111
