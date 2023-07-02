import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt(); // コイントスをした人の数
        var AList = new ArrayList<Integer>();
        var BList = new ArrayList<Integer>();
        for (var i = 0; i < N; i++) {
            AList.add(scanner.nextInt()); // 表の回数のリスト
            BList.add(scanner.nextInt()); // 裏の回数のリスト
        }

        // ===== 表の確率算出 =====
        var rateList = new ArrayList<Double>();
        for (var i = 0; i < N; i++) {
            var front = Double.valueOf(AList.get(i));
            var back  = Double.valueOf(BList.get(i));
            // rateList.add(front / (front + back));
            rateList.add(front / (front + back));
        }
        // System.out.println(rateList);

        // ===== 出力値の生成 =====
        // MAPに詰め替え
        var map = new HashMap<Integer, Double>();
        for (var i = 0; i < rateList.size(); i++) {
            map.put(i, rateList.get(i));
        }

        // MAPのvalueで昇順ソート
        /* 
        // var mapValueList = map.values();
        Arrays.sort((Collection<double>)mapValueList);

        var resultList = new ArrayList<String>();
        var maxRate = BigDecimal.ZERO;
        var limitRate = BigDecimal.ZERO;
        var maxIndex = 0;
        var limitIndex = 0;

        for (var i = 0; i < N; i++) {
            for (var j = 0; j < rateList.size(); j++) {
                System.out.println("debug:" + maxRate);
                System.out.println("debug:" + rateList.get(j));
                if (limitRate.compareTo(rateList.get(j)) > 0) {
                    continue;
                }
                if (limitRate.compareTo(rateList.get(j)) == 0 && limitIndex == j) {
                    continue;
                }
                if (maxRate.compareTo(rateList.get(j)) < 0) {
                    maxRate = rateList.get(j);
                    maxIndex = j;
                }
            }
            resultList.add(String.valueOf(maxIndex));
            limitRate = rateList.get(maxIndex);
            limitIndex = maxIndex;
        }
        */

        // ===== 値の出力 =====
        // System.out.println(String.join(" ", resultList));
   }
}

 0     1     2
[0.25, 0.75, 0.5]