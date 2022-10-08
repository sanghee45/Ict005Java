package sanghee;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		int number;
		double c$;
		double f$;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 화씨->섭씨\r"+ "2. 섭씨->화씨\r");
		System.out.print("번호를 선택하시오");
		number = sc.nextInt();
		
		
				
		if (number == 1) {
			System.out.print("화씨온도를 입력하시오");
			c$ = sc.nextDouble();
			System.out.print((c$-32.0)*5.0/9.0);}
		
			else if (number == 2) {
				System.out.print("섭씨온도를 입력하시오");
				f$ = sc.nextDouble();
				System.out.print(f$*18.0+32.0);}
		

	}

}
