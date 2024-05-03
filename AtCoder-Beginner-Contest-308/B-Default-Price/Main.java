import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt(); // 食べた皿の枚数
        var M = scanner.nextInt(); // 色の種類の数
        var CList = new ArrayList<String>(); // 食べた皿の色
        for (var i = 0; i < N; i++) {
            CList.add(scanner.next());
        }
        var DList = new ArrayList<String>(); // 色の一覧
        for (var i = 0; i < M; i++) {
            DList.add(scanner.next());
        }
        var PList = new ArrayList<Integer>(); // 金額の一覧（0はデフォルトの金額）
        for (var i = 0; i < M + 1; i++) {
            PList.add(scanner.nextInt());
        }
        scanner.close();

        // ===== 金額の算出 =====
        var sum = 0;
        for (var colour : CList) {
            var index = DList.indexOf(colour);
            if (index == -1) {
                sum = sum + PList.get(0);
            } else {
                sum = sum + PList.get(index + 1);
            }
        }

        // ===== 値の出力 =====
        System.out.println(sum);
    }
}