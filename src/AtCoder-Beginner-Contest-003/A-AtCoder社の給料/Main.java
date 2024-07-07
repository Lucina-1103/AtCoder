import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int total = 0;

		for(int i = 1 ; i <= a ; i++)
		{
			total = total + (i * 10000);
		}

		System.out.println(total / a);
	}
}
