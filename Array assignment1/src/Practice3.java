//6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] average = {85.6,79.5,83.1,80.0,78.2,75.0};
		double sum = 0.0;
		System.out.print("몇반?");
		int class1 = sc.nextInt();
		System.out.print("몇반?");
		int class2 = sc.nextInt();
		sum = average[class1]+average[class2];
		System.out.print(sum);
		
	}}