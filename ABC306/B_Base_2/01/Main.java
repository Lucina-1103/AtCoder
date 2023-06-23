import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var str = scanner.nextLine().split(" ");
        scanner.close();

        BigInteger result = BigInteger.ZERO;
        for (var i = 0; i < str.length; i++) {
            result = result.add(BigInteger.valueOf(Integer.valueOf(str[i])).multiply(BigInteger.TWO.pow(i)));
        }
        System.out.println(result);
    }
}