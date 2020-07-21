package test200720;

import java.util.List;

public class NaverService {


	public void id(List<NaverMemberDTO> members) {
		for (int i = 0; i < members.size(); i++ ) {
			System.out.println("이름 출력 : "+members.get(i).getName());
		}
	}

	public void idNamePw(List<NaverMemberDTO> members) {
		for (int i = 0; i < members.size(); i++ ) {
			System.out.println(members.get(i));
		}
	}

	public void idView(List<NaverMemberDTO> memList) {
		for (int i = 0; i<memList.size(); i++) {
			System.out.println(memList.get(i).getId());
		}
		
	}

	public void allView(List<NaverMemberDTO> memList) {
		for (int i = 0; i<memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}




	
	

	
	
}
