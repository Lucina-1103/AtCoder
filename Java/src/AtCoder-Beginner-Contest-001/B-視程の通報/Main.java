import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		// Scannerクラスを使用して、入力を受ける
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();

		double vv = 0;

		if(a < 100){
			// 100以下の時
			vv = 0;
		}else if(a >= 100 && a <= 5000){
			// 100以上 5000以下の時
			vv = a / 1000 * 10;
		}else if(a >= 6000 && a <= 30000){
			// 6000以上 30000以下の時
			vv = a / 1000 + 50;
		}else if(a >= 35000 && a <= 70000){
			// 35000以上 70000以下の時
			vv = (a / 1000 - 30) / 5 + 80;
		}else if(a >= 70000){
			// 70000以上の時
			vv = 89;
		}

		System.out.printf("%02d\n",(int)vv);
	}
}
