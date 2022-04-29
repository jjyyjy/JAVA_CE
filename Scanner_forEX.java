package 자바프로그래밍1_3주차2;
import java.util.Scanner;
public class Scanner_forEX {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳입력 : ");
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
