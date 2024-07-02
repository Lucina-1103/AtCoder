import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var charArray = scanner.next().toCharArray();
        scanner.close();

        // ===== 集計処理 =====
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            var str = String.valueOf(charArray[i]);
            if (map.containsKey(str)) {
                map.replace(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        // ===== 判定処理 =====
        var result = "Yes";
        // mapのサイズが2ではない場合はNo
        if (map.size() != 2) {
            result = "No";
            System.out.println(result);
            return;
        }
        // それぞれの文字種が2つ出現していない場合はNo
        for (var count : map.values()) {
            if (count != 2) {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }
}