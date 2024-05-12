import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var charArray = scanner.next().toCharArray();
        scanner.close();

        // ===== 集計処理 =====
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(String.valueOf(charArray[i]))) {
                map.replace(String.valueOf(charArray[i]), map.get(String.valueOf(charArray[i])) + 1);
            } else {
                map.put(String.valueOf(charArray[i]), 1);
            }
        }

        // ===== 判定処理 =====
        var result = "Yes";
        if (map.size() == 2) {
            for (var count : map.values()) {
                if (count != 2) {
                    result = "No";
                }
            }
        } else {
            result = "No";
        }

        System.out.println(result);
    }
}