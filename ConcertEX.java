package �ڹ����α׷���1_6����;

import java.util.Scanner;

class Concert {
	
	private String S[];
	private String A[];
	private String B[];
	private Scanner sc;
	
	Concert() {
		
		sc = new Scanner(System.in);
		S = new String[10];
		A = new String[10];
		B = new String[10];
		for(int i=0; i<S.length; i++) {
			S[i] = "--- ";
			A[i] = "--- ";
			B[i] = "--- ";
		}
	}
	public static void printSeat(String seat[]) {
		
		for(int i=0; i<seat.length; i++) {
			System.out.print(""+seat[i]+"");
		}
		System.out.println();
	}
	public void allPrint() {
		
		System.out.print("S>>");
		Concert.printSeat(S);
		System.out.print("A>>");
		Concert.printSeat(A);
		System.out.print("B>>");
		Concert.printSeat(B);
		System.out.print("��ȸ�� �Ϸ�Ǿ����ϴ�.\n");
	}
	public void SelectSeat() {
		while(true) {
			
			System.out.print("�¼����� : S(1), A(2), B(3)>>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("S>>");
				printSeat(S);
				inputSeat(S);
				return;
			case 2:
				System.out.print("A>>");
				printSeat(A);
				inputSeat(A);
				return;
			case 3:
				System.out.print("B>>");
				printSeat(B);
				inputSeat(B);
				return;
			default:
				System.out.print("�ٽ� �Է��� �ּ���.");
			}
		}
	}
	public void inputSeat(String seat[]) {
		
		System.out.print("�̸�>>");
		String name = sc.next();
		
		while(true) {
			System.out.print("��ȣ>>");
			int num = sc.nextInt();
			num--;
			if(seat[num].equals("--- ")) {
				seat[num] = name;
				break;
			}
			else {
				System.out.print("�ٸ� �¼��� �������ּ���.");
			}
		}
	}
	public void x_selectSeat() {
		while(true) {
			
			System.out.print("�¼����� : S(1), A(2), B(3)>>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("S>>");
				printSeat(S);
				delete(S);
				return;
			case 2:
				System.out.print("A>>");
				printSeat(A);
				delete(A);
				return;
			case 3:
				System.out.print("B>>");
				printSeat(B);
				delete(B);
				return;
			default:
				System.out.print("�ٽ� �Է��� �ּ���.");
			}
		}
	}
	public void delete(String seat[]) {
		
		System.out.print("�̸�>>");
		String name = sc.next();
		
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i]="--- ";
				break;
			}
		}
	}
}
public class ConcertEX {
	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
		 
	      System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
	      Concert concert = new Concert();
	      
	      while(true) {
	         System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
	         int select = sc.nextInt();
	         switch(select) {
	         case 1:
	            concert.SelectSeat();
	            break;
	         case 2:
	            concert.allPrint();
	            break;
	         case 3:
	            concert.x_selectSeat();
	            break;
	         case 4:
	            sc.close();
	            return;
	         default :
	            System.out.println("�ٽ� �Է��� �ּ���.");
	         }
	      }
	   }
}
