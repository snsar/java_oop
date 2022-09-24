import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long tmp = 1, res = 0;
        for(int i = 1; i <= n; i++) {
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
    }
}
