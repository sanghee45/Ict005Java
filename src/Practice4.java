import java.util.Scanner;
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] n = new int[10];
		int sum1 = 0;
		double sum2 = 0.0;
		double avg = 0.0;
		System.out.print("10개의 정수를 입력하시오:");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();

			if (i%2 == 0) {
				sum2 = sum2+n[i];
			}
			else {
				sum1 = sum1+n[i];
			}
		}
		System.out.println("sum : "+sum1);
		System.out.print("avg : "+sum2/(n.length/2));
		
	}
}
// 95 100 88 65 76 89 58 93 77 99