package �ڹ����α׷���1_3����;
import java.util.Scanner;
public class Scanner_ifEX {
	public static void main(String args[]) {
		System.out.print("1������ �������� �߽��� �Է� : ");
		Scanner scanner = new Scanner(System.in);
		
		 double x1 = scanner.nextDouble();//1�� x��ǥ
		 double y1 = scanner.nextDouble();//1�� y��ǥ
		 double r1 = scanner.nextDouble();//1�� ������
		 
		System.out.print("2������ �������� �߽��� �Է� : ");
		
		 double x2 = scanner.nextDouble();//2�� x��ǥ
		 double y2 = scanner.nextDouble();//2�� y��ǥ
		 double r2 = scanner.nextDouble();//2�� ������
		 
		double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		 
		if(d < r1 + r2) {
			System.out.print("�� ���� ��Ĩ�ϴ�.");
		}
		else {
			System.out.print("�� ���� ��ġ�� �ʽ��ϴ�.");
		}
		scanner.close();
	}
}
