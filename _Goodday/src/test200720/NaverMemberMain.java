package test200720;

import java.util.*;

public class NaverMemberMain {

	public static void main(String[] args) {
		
		List<NaverMemberDTO> members = new ArrayList<NaverMemberDTO>();
		
		NaverService ser = new NaverService();
		NaverMemberDTO nmD1 = new NaverMemberDTO();
		NaverMemberDTO nmD2 = new NaverMemberDTO();
		NaverMemberDTO nmD3 = new NaverMemberDTO();
		
		nmD1.setName("±Ë¿∫∫Ò");
		nmD1.setId("silverain127");
		nmD1.setPw("abc111");
		members.add(nmD1);
		
		nmD2.setName("¿Ã¡ÿºÆ");
		nmD2.setId("lovely_JJun");
		nmD2.setPw("12345678");
		members.add(nmD2);
		
		nmD3.setName("±Ë∆›ƒ°");
		nmD3.setId("punch0325");
		nmD3.setPw("111222a");
		members.add(nmD3);
		
		ser.id(members);
		ser.idNamePw(members);
	
		
		
		
		
		
		

	}

}
