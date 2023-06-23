import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var length = scanner.nextInt();
        var str = scanner.next();
        scanner.close();

        // ===== 出力値の生成 =====
        final int count = 2;
        var result = "";

        for (var i = 0; i < length; i++) {
            for (var j = 0; j < count; j++) {
                result = result + str.charAt(i);
            }
        }

        // ===== 出力 =====
        System.out.println(result);
    }
}