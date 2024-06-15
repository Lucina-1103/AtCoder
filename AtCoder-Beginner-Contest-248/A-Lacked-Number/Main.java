import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var str = scanner.next();
        scanner.close();

        // ===== 出力値の生成 =====
        for (var i = 0; i < 10; i++) {
            if (!str.contains(String.valueOf(i))) {
                System.out.println(i);
            }
        }
    }
}