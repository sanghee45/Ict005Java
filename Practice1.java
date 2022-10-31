import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 1; sum < n; i = i+2 ) {
			count = count + 1;
			sum = sum + i;


		}
		System.out.print(count+"\s");
		System.out.print(sum);
	}

}
