package 자바프로그래밍1_3주차;
import java.util.Scanner;
public class Scanner_ifEX {
	public static void main(String args[]) {
		System.out.print("1번원의 반지름과 중심점 입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		 double x1 = scanner.nextDouble();//1번 x좌표
		 double y1 = scanner.nextDouble();//1번 y좌표
		 double r1 = scanner.nextDouble();//1번 반지름
		 
		System.out.print("2번원의 반지름과 중심점 입력 : ");
		
		 double x2 = scanner.nextDouble();//2번 x좌표
		 double y2 = scanner.nextDouble();//2번 y좌표
		 double r2 = scanner.nextDouble();//2번 반지름
		 
		double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		 
		if(d < r1 + r2) {
			System.out.print("두 원이 겹칩니다.");
		}
		else {
			System.out.print("두 원이 겹치지 않습니다.");
		}
		scanner.close();
	}
}
