import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var length = scanner.nextInt();
        var str = scanner.next();
        scanner.close();

        for (var i = 0; i < length; i++) {
            System.out.print(str.charAt(i));
            System.out.print(str.charAt(i));
        }
    }
}