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

        // ===== MAPに詰め替え =====
        var list = new ArrayList<Record>();
        for (var i = 0; i < N; i++) {
            var front = AList.get(i);
            var back  = BList.get(i);
            var rate = Double.valueOf((double)front / (front + back));

            // System.out.println("===============");
            // System.out.println("front:" + front);
            // System.out.println("back:" + back);
            // System.out.println("rate:" + rate);

            var record = new Record(i, front, back, rate);
            list.add(record);
            // System.out.println(":" + i + ":" +record.getA() + ":" + record.getB() + ":" + record.getR());
        }
        
        Collections.sort(list, (record1, record2) -> {
            Long rate1 = record1.getA() * (record2.getA() + record2.getB());
            Long rate2 = record2.getA() * (record1.getA() + record1.getB());
            // System.out.println("rate1:" + rate1);
            // System.out.println("rate2:" + rate2);
            return rate2.compareTo(rate1);
        });

        for (var record : list) {
            System.out.println((record.getNo() + 1) + " ");
        }

    }
   
    public static class Record {
        private Integer no;
        private Long a;
        private Long b;
        private Double r;

        public Record(Integer no, Long a, Long b, Double r) {
            this.no = no;
            this.a = a;
            this.b = b;
            this.r = r;
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

        public void setR(Double r) {
            this.r = r;
        }

        public Double getR() {
            return this.r;
        }
    }    
}