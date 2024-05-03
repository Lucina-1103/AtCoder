import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var temperature = scanner.nextInt();
        scanner.close();

        // ===== 出力値の生成 =====
        if (30 <= temperature) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}