import java.util.Scanner;
public class ScannerEX {
    public static void main(String args[]) {
    	System.out.println("2�ڸ��� ���� �Է�(11~99)");
    	Scanner scanner = new Scanner(System.in);
    	
    	int number = scanner.nextInt();
    	
    	if((number < 10) || (99 < number)) {
    		System.out.println("11�̻�, 99������ ���� �Է��ϼ���");
    	}
    	else if((number >= 10) && (number <= 99)){
    		if(number%11==0) {
    			System.out.println("Yes! 10���ڸ��� 1���ڸ��� �����ϴ�.");
    		}
    		else {
    			System.out.println("No! 10���ڸ��� 1���ڸ��� �ٸ��ϴ�.");
    		}
    	}
    	scanner.close();
    }
}
