/*자연수 n을 입력받아 다음과 같이 출력하는 프로그램을 작성하시오. *****
												 ***
												  *                  */
import java.util.Scanner;
public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n = sc.nextInt();
		for (int x = n; x >= 1; x--){
			for (int y = x*2; y >= 1; y--) {
				System.out.print("*");
			}
			System.out.println();}
	}

}
