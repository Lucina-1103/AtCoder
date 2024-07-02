import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        var listI = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            var str = scanner.next();
            listI.add(str);
        }
        scanner.close();

        // ===== 結果の生成 =====
        var resultListI = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < n; i++) {
            var resultListJ = new ArrayList<String>();
            for (int j = 0; j < n; j++) {
                // ===== 1行目 =====
                if (i == 0) {
                    if (j == 0) {
                        resultListJ.add(String.valueOf(listI.get(i + 1).charAt(j)));
                    } else {
                        resultListJ.add(String.valueOf(listI.get(i).charAt(j - 1)));
                    }
                }
                // ===== 中間行 =====
                if (!(i == 0) && !(i == n - 1)) {
                    if (j == 0) {
                        resultListJ.add(String.valueOf(listI.get(i + 1).charAt(j)));
                    } else if (j == n - 1) {
                        resultListJ.add(String.valueOf(listI.get(i - 1).charAt(j)));
                    } else {
                        resultListJ.add(String.valueOf(listI.get(i).charAt(j)));
                    }
                }
                // ===== 最終行 =====
                if (i == n - 1) {
                    if (j == n - 1) {
                        resultListJ.add(String.valueOf(listI.get(i - 1).charAt(j)));
                    } else {
                        resultListJ.add(String.valueOf(listI.get(i).charAt(j + 1)));
                    }
                }
            }
            resultListI.add(resultListJ);
        }

        // ===== 結果出力 =====
        for (var result : resultListI) {
            System.out.println(String.join("", result));
        }
    }
}