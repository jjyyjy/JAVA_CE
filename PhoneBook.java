package 자바프로그래밍1_5주차;
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
		System.out.print("인원수 : ");
		int pn = scanner.nextInt();
		phone = new Phone[pn];
		
		for(a=0; a<phone.length; a++) {
			System.out.print("이름과 전화번호를 입력해주세요 : ");
			String name = scanner.next();
			String tel = scanner.next();
			phone[a] = new Phone(name, tel);
		}
		System.out.print("저장되었습니다.\n");
		while(true) {
			
			System.out.print("찾을 이름을 검색해주세요 : ");
			String name = scanner.next();
			
			for(a=0; a<pn; a++) {
				if(name.equals(phone[a].getName())) {
					System.out.print(name+"의 번호는"+phone[a].getTel()+"입니다.\n");
					a--;
					break;
				}
			}
			if(name.equals("그만")) break;
			if(a == pn) {
				System.out.print(name+"이 없습니다.");
			}
		}
		scanner.close();
	}
}
