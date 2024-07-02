import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        scanner.close();

        // ===== 判定用Listの作成 =====
        var listA = List.of(1, 2, 3);
        var listB = List.of(4, 5, 6);
        var listC = List.of(7, 8, 9);
        var lists = new ArrayList<List<Integer>>();
        lists.add(listA);
        lists.add(listB);
        lists.add(listC);

        // ===== 判定 =====
        var result = "No";
        for (var list : lists) {
            if (list.contains(a) && list.contains(b)) { 
                var indexA = list.indexOf(a);
                var indexB = list.indexOf(b);
                if (indexA + 1 == indexB) {
                    result = "Yes";
                }
            }
        }

        // ===== 結果出力 =====
        System.out.println(result);
    }
}