import java.util.Scanner;
public class Practice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n){
			sum = sum + i;
			i = i + 1;}
		System.out.print(sum);	
		}}


