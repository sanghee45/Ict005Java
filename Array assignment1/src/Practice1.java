import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] a = new String[10];
		System.out.print("10개의 문자를 입력하시오:");
		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.next();

			if (i==0 || i %3==0 && i%9 !=0) {
				System.out.print(a[i]+" ");
			}

		}
	
	}
}
