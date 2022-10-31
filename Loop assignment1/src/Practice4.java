import java.util.Scanner;
public class Practice4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n = sc.nextInt();
		int sum = 0;
		while (n <= 100) {
			for (int i = 1; i <=n; i++) {
				sum = sum + i; }
			break;}
		System.out.print(sum);
	}
}
