import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		// Scannerクラスを使用して、入力を受ける
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if(a % 3 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
