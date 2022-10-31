/*삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "continue?" 에서 하나의 문자를 입력받아 그 문자가 
 * 'Y'나 'y'면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.*/
import java.util.Scanner;
public class Practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("Base:");
		double base = sc.nextDouble();
		System.out.print("Height:");
		double height = sc.nextDouble();
		double width = base*height/2;
		System.out.print("Triangle width:\t"+width+"\n");
		System.out.print("Continue?");
		String answer = sc.next();
		if(answer.equals("Y") || (answer.equals("y"))) {continue;}
		else {break;}
		
	
		
		
	}}}
			
				
			
		
