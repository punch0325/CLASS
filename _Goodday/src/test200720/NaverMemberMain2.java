package test200720;

import java.util.ArrayList;
import java.util.*;

public class NaverMemberMain2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        List<NaverMemberDTO> memList = new ArrayList<NaverMemberDTO>();
        NaverMemberDTO mem = null;
		NaverService ser = new NaverService();
		
		
		boolean end = true;
		int menu = 0;
		String name = "";
		String id = "";
		String pw = "";
		
		while(end) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.ȸ�� ��� | 2.ȸ�� ���̵� Ȯ�� | 3.ȸ�� ���� Ȯ�� | 4.����");
			System.out.println("-----------------------------------------------");
			
			System.out.print("���� > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("ID : ");
				id = scan.next();
				System.out.print("PW : ");
				pw = scan.next();
				
				mem = new NaverMemberDTO(); //��ü ������ �ݺ��� �ۿ� ������ �ݺ��� ���ư��� ������ ���� ������ ���� ���� �Ǿ� ���
				mem.setId(id);
				mem.setName(name);
				mem.setPw(pw);
				
				memList.add(mem);
				break;
            case 2 :
            	ser.idView(memList);
				break;
            case 3 :
				ser.allView(memList);
				break;
            case 4 :
				end = false;
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
		}

		scan.close();
	
	
	
	
	
	
	
	}

}
