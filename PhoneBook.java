package �ڹ����α׷���1_5����;
import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Phone phone[];
		int a;
		System.out.print("�ο��� : ");
		int pn = scanner.nextInt();
		phone = new Phone[pn];
		
		for(a=0; a<phone.length; a++) {
			System.out.print("�̸��� ��ȭ��ȣ�� �Է����ּ��� : ");
			String name = scanner.next();
			String tel = scanner.next();
			phone[a] = new Phone(name, tel);
		}
		System.out.print("����Ǿ����ϴ�.\n");
		while(true) {
			
			System.out.print("ã�� �̸��� �˻����ּ��� : ");
			String name = scanner.next();
			
			for(a=0; a<pn; a++) {
				if(name.equals(phone[a].getName())) {
					System.out.print(name+"�� ��ȣ��"+phone[a].getTel()+"�Դϴ�.\n");
					a--;
					break;
				}
			}
			if(name.equals("�׸�")) break;
			if(a == pn) {
				System.out.print(name+"�� �����ϴ�.");
			}
		}
		scanner.close();
	}
}
