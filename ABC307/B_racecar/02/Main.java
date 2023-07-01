import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt();
        var wordList = new ArrayList<String>();
        for (var i = 0; i < N; i++) {
            wordList.add(scanner.next());
        }
        scanner.close();

        // ===== 文言を結合したリストの作成 =====
        var wordJoinList = new ArrayList<String>();
        for (var i = 0; i < N; i++) {
            for (var j = 0; j < N; j++) {
                // i と j は相違
                if (i == j) continue;
                wordJoinList.add(wordList.get(i) + wordList.get(j));
            }
        }

        // ===== 回文の判定 =====
        var result = false;
        for (var word : wordJoinList) {
            var result2 = true;
            for (var k = 0; k < word.length(); k++) {
                if (word.charAt(k) != word.charAt(word.length() + 1 - (k + 2))) {
                    result2 = false;
                }
            }
            if (result2) {
                result = true;
                break;
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