import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        final Integer numCount = 8;
        Scanner scanner = new Scanner(System.in);
        var numList = new ArrayList<Integer>();
        for (var i = 0; i < numCount; i++) {
            numList.add(scanner.nextInt());
        }
        scanner.close();

        // ===== 条件判定 =====
        var result = true;
        // 条件1の判定
        var prevNum = 0;
        for (var num : numList) {
            if (!(prevNum <= num)) {
                result = false;
            }
            prevNum = num;
        }

        // 条件2の判定
        final Integer NUM_MIN_LIMIT = 100;
        final Integer NUM_MAX_LIMIT = 675;
        for (var num : numList) {
            if (!(NUM_MIN_LIMIT <= num && num <= NUM_MAX_LIMIT)) {
                result = false;
            }
        }

        // 条件3の判定
        final Integer TTT = 25;
        for (var num : numList) {
            if(num % TTT != 0) {
                result = false;
            }
        }

        // ===== 結果出力 =====
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}