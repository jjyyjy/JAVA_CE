import java.util.Scanner;
public class ScannerEX {
    public static void main(String args[]) {
    	System.out.println("2자리수 정수 입력(11~99)");
    	Scanner scanner = new Scanner(System.in);
    	
    	int number = scanner.nextInt();
    	
    	if((number < 10) || (99 < number)) {
    		System.out.println("11이상, 99이하의 수를 입력하세요");
    	}
    	else if((number >= 10) && (number <= 99)){
    		if(number%11==0) {
    			System.out.println("Yes! 10의자리와 1의자리가 같습니다.");
    		}
    		else {
    			System.out.println("No! 10의자리와 1의자리가 다릅니다.");
    		}
    	}
    	scanner.close();
    }
}
