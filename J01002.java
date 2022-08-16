import java.util.Scanner;

public class J01002 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long S, n;

        while(T > 0) {
            n = sc.nextInt();
            S = (n * (n+1)) / 2;
            System.out.println(S);
            T--;
        }
    }
}