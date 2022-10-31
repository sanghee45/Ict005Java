//6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] weight = new double[6];
		double sum = 0.0;
		double average = 0.0;
		System.out.print("몸무게를 입력하시오:");
		for (int i = 0; i < weight.length; i++) {
			weight[i] = sc.nextDouble();
			sum = sum+weight[i];
		}
		average = sum/weight.length;
		System.out.print(Math.round(average*10)/10.0);
	}



}

// 23.2 39.6 66.4 50.0 45.6 48.0