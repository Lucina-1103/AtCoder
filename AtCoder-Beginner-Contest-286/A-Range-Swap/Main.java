import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // ===== 入力値の受け取り =====
        Scanner scanner = new Scanner(System.in);
        var count     = scanner.nextInt();
        var swapFrom1 = scanner.nextInt();
        var swapTo1   = scanner.nextInt();
        var swapFrom2 = scanner.nextInt();
        var swapTo2   = scanner.nextInt();
        var array = new ArrayList<Integer>();
        for (int i = 0; i <= count - 1; i++) {
            array.add(scanner.nextInt());
        }
        scanner.close();

        // ===== swapFrom1～swapTo1とswapFrom2～swapTo2を入替 =====
        var diff = swapFrom2 - swapFrom1;
        for (var i = swapFrom1 - 1; i <= swapTo1 - 1; i++) {
            var temp = array.get(i + diff);
            array.set(i + diff, array.get(i));
            array.set(i, temp);
        }

        // ===== 結果出力 =====
        for (var i = 0; i <= count - 1; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}