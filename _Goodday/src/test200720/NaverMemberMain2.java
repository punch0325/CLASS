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
			System.out.println("1.회원 등록 | 2.회원 아이디 확인 | 3.회원 정보 확인 | 4.종료");
			System.out.println("-----------------------------------------------");
			
			System.out.print("선택 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("ID : ");
				id = scan.next();
				System.out.print("PW : ");
				pw = scan.next();
				
				mem = new NaverMemberDTO(); //객체 선언이 반복문 밖에 있으면 반복이 돌아가는 과정에 따라 마지막 값만 저장 되어 출력
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
				System.out.println("종료되었습니다.");
				break;
			}
			
		}

		scan.close();
	
	
	
	
	
	
	
	}

}
