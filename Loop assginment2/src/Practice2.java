import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n1 = sc.nextInt();
		System.out.print("정수를 입력하시오:");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			for (int x = 1; x <= 9; x++) {
				for (int y = n1; y >= n2; y--) {
					System.out.printf("%d * %d = %2d\s\s\s",y,x,x*y);
				}
				System.out.println("");
			}
		}
		else {
			for (int x = 1; x <= 9; x++) {
				for (int y = n1; y <= n2; y++) {
					System.out.printf("%d * %d = %2d\s\s\s",y,x,x*y);
				}

				System.out.println("");
			}
		}
	}
}
