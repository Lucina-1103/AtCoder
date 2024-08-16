import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        scanner.close();

        // ===== 計算処理 =====
        number = (number - number % 3) / 3;

        // ===== 出力処理 =====
        System.out.println(number);
    }
}