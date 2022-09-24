import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] myArr = new int[T][3];

        for(int i = 0; i < T; i++) {
            for(int j = 0; j < 3; j++) {
                myArr[i][j] = sc.nextInt();
            }
        }

        int count1, count0, res = 0;

        for(int i = 0; i < T; i++) {
            count1 = count0 = 0;
            for(int j = 0; j < 3; j++) {
                if(myArr[i][j] == 1) count1++;
                else count0++;
            }
            if(count1 > count0) res++;
        }

        System.out.println(res);

    }
}
