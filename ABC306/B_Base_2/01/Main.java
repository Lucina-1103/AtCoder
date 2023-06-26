import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の受け取り ===== 
        Scanner scanner = new Scanner(System.in);
        var str = scanner.nextLine().split(" ");
        scanner.close();

        // ===== 指数計算 ===== 
        BigInteger result = BigInteger.ZERO;
        for (var i = 0; i < str.length; i++) {
            result = result.add(BigInteger.valueOf(Integer.valueOf(str[i])).multiply(BigInteger.TWO.pow(i)));
        }

        // ===== 出力 ===== 
        System.out.println(result);
    }
}