package �ڹ����α׷���1_3����2;
import java.util.Scanner;
public class Scanner_forEX {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ĺ��Է� : ");
	    String str = scanner.next();
	    char a = str.charAt(0);
		
		for(int i=0; i<=a-'a'; i++) {
			for(char j = 'a'; j<= a-i; j++) {
	            System.out.print(j);
	         }
	         System.out.println();
		}
		scanner.close();
	}
}
