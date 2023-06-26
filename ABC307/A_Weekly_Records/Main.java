import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt();
        scanner.nextLine(); // 読み捨て
        var A = scanner.nextLine().split(" ");
        scanner.close();

        var counter = 0;
        var walkSum = 0;
        for (var walkCount : A) {
            var walkCountInt = Integer.valueOf(walkCount);

            walkSum = walkSum + walkCountInt;
            if (counter == 6) {
                System.out.print(walkSum);
                System.out.print(" ");
                walkSum = walkSum + walkCountInt;

                walkSum = 0;
                counter = 0;
                continue;
            }

            counter++;
        }
    }
}