import java.util.Scanner;
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n = sc.nextInt();
		for (int x = 1; x <= n; x++){
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();}
	}

}
