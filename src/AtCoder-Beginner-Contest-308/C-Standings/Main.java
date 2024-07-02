import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 入力値の読取 =====
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt(); // コイントスをした人の数
        var AList = new ArrayList<Long>();
        var BList = new ArrayList<Long>();
        for (var i = 0; i < N; i++) {
            AList.add(Long.parseLong(scanner.next())); // 表の回数のリスト
            BList.add(Long.parseLong(scanner.next())); // 裏の回数のリスト
        }
        scanner.close();

        // ===== クラスに詰め替え =====
        var list = new ArrayList<Record>();
        for (var i = 0; i < N; i++) {
            list.add(new Record(i, AList.get(i), BList.get(i)));
        }
        
        // ===== ソート =====
        Collections.sort(list, (record1, record2) -> {
            Long rate1 = record1.getA() * (record2.getA() + record2.getB());
            Long rate2 = record2.getA() * (record1.getA() + record1.getB());
            return rate2.compareTo(rate1);
        });

        // ===== 結果生成 =====
        var resultList = new ArrayList<String>();
        for (var record : list) {
            resultList.add(String.valueOf(record.getNo() + 1));
        }

        // ===== 結果出力 =====
        System.out.println(String.join(" ", resultList));
    }
   
    public static class Record {
        private Integer no;
        private Long a;
        private Long b;

        public Record(Integer no, Long a, Long b) {
            this.no = no;
            this.a = a;
            this.b = b;
        }

        public void setNo(Integer no) {
            this.no = no;
        }

        public Integer getNo() {
            return this.no;
        }

        public void setA(Long a) {
            this.a = a;
        }

        public Long getA() {
            return this.a;
        }

        public void setB(Long b) {
            this.b = b;
        }

        public Long getB() {
            return this.b;
        }
    }    
}