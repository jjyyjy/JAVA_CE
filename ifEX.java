package �ڹ����α׷���1_4����;
import java.util.Scanner;
public class ifEX {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String UserSelect, ComSelect;
		
		int n;
	      System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do {
			System.out.println("���� ���� ��");
			UserSelect = scanner.next();
			if(UserSelect.equals("�׸�"))
				break;
			
			n = (int)(Math.random()*3);
			
			ComSelect = str[n];
			
			if(UserSelect.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �����ϴ�." );
					continue;
				}
				else if(str[n].equals("����")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �����ϴ�." );
					continue;
				}
				else if(str[n].equals("��")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �̰���ϴ�." );
					continue;
				}
			}
			else if(UserSelect.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �̰���ϴ�." );
					continue;
				}
				else if(str[n].equals("����")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �����ϴ�." );
					continue;
				}
				else if(str[n].equals("��")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �����ϴ�." );
					continue;
				}
			}
			else if(UserSelect.equals("��")) {
				if(str[n].equals("����")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �����ϴ�." );
					continue;
				}
				else if(str[n].equals("����")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �̰���ϴ�." );
					continue;
				}
				else if(str[n].equals("��")) {
					System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + " �����ϴ�." );
					continue;
				}
			}
			System.out.println("�����= " + UserSelect + "\n��ǻ��= " + ComSelect + "");
		}while(true);
		System.out.println("������ �����մϴ�.");
		scanner.close();
	}
}
