// 0이 입력될떄까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
public class Practice5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n;
		do {n = sc.nextInt();
			if (n % 3 != 0 || n % 5 != 0) {
				n = sc.nextInt();
				cnt = cnt+1;}
			}while (n != 0);
				System.out.print(cnt);
	}
		}
		