package 자바프로그래밍1_4주차;
import java.util.Scanner;
public class ifEX {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String UserSelect, ComSelect;
		
		int n;
	      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.println("가위 바위 보");
			UserSelect = scanner.next();
			if(UserSelect.equals("그만"))
				break;
			
			n = (int)(Math.random()*3);
			
			ComSelect = str[n];
			
			if(UserSelect.equals("가위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 비겼습니다." );
					continue;
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 졌습니다." );
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 이겼습니다." );
					continue;
				}
			}
			else if(UserSelect.equals("바위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 이겼습니다." );
					continue;
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 비겼습니다." );
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 졌습니다." );
					continue;
				}
			}
			else if(UserSelect.equals("보")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 졌습니다." );
					continue;
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 이겼습니다." );
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + " 비겼습니다." );
					continue;
				}
			}
			System.out.println("사용자= " + UserSelect + "\n컴퓨터= " + ComSelect + "");
		}while(true);
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}
