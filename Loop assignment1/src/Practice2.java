import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = n; i <= 100; i++) {
			sum = sum + i;}
		System.out.print(sum);}
	}


