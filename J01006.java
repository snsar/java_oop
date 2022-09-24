import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] arr = new long[95];

        arr[1] = 1;
        arr[2] = 1;


        for(int i = 3; i < 93; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        int t = sc.nextInt(), n;

        while(t > 0) {
            n = sc.nextInt();
            System.out.println(arr[n]);
            t--;
        }

    }
}
