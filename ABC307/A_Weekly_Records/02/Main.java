import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        Scanner scanner = new Scanner(System.in);
        var weekNum = scanner.nextInt();
        scanner.nextLine(); // 読み捨て

        var walkNumLine = scanner.nextLine();
        
        var walkSumMap = new HashMap<Integer, Integer>();
        
        for (var walkNumStr : walkNumLine.split(" ")) {
            Integer key = i / 7; // 小数点以下切捨て
            
            Integer.valueOf(walkNumStr);

            if (walkSumMap.containsKey(key) ) {
                var sum = walkSumMap.get(key);
                sum = sum + walkNum;
                walkSumMap.replace(key, sum);
            }
            i++;

        }
        scanner.nextLine(); // 読み捨て


        
        while (scanner.hasNextInt()) {
            walkNumList.add(scanner.nextInt());
        }
        scanner.close();

        // ===== 出力値の生成 =====
        var walkSumMap = new HashMap<Integer, Integer>();
        var i = 0;
        for (var walkNum : walkNumList) {
            
            if (walkSumMap.containsKey(key) ) {
                var sum = walkSumMap.get(key);
                sum = sum + walkNum;
                walkSumMap.replace(key, sum);
            }
            i++;
        }

        // ===== 出力 =====
        for (var walkSum : walkSumMap.values()) {
            System.out.print(walkSum);
            System.out.print(" ");
        }
    }
}