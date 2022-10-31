import java.util.Scanner;
public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int number = sc.nextInt();
		for(int i =number; i<100; i=i+number) {
			System.out.print(i + " ");   
			if(i%10 == 0) {
				break;}
		}
	}

}


