import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int n1 = sc.nextInt();
		System.out.print("정수를 입력하시오:");
		int n2 = sc.nextInt();
		for (int x = 1; x <=3; x++) {
			for (int y = 1; y <=4; y++) {
				System.out.print(x*y+"\s");
			}
			System.out.println("");
		}
	}



}
