import java.util.Scanner;
public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] n = new int[10];
		int min = 0;
		System.out.print("10개의 정수를 입력하시오:");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (i == 0) {
				min = n[i];
			}
			else if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.print(min);
	}	
}
// 5 10 8 55 6 31 12 24 61 2 