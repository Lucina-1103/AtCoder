import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Integer WEEK_COUNT = 7;

        // ===== 入力値の読取 =====
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt();
        var walkCountList = new ArrayList<Integer>();
        for (var i = 0; i < N * WEEK_COUNT; i++) {
            walkCountList.add(scanner.nextInt());
        }
        scanner.close();

        // ===== 出力値の生成 =====
        var walkCountSumList = new ArrayList<String>();
        var j = 0;
        var sum = 0;
        for (var walkCount : walkCountList) {
            sum = sum + walkCount;
            if ((j + 1) % 7 == 0) {
                walkCountSumList.add(String.valueOf(sum));
                sum = 0;
            }
            j++;
        }

        // ===== 結果出力 =====
        System.out.println(String.join(" ", walkCountSumList));
    }
}