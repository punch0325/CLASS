package test200723_02;

import java.util.*;

public class TryCatch_01 {

	public static void main(String[] args) {
		/* 예외 처리 (try ~ catch ~ finally)
		   - Exception 오류가 뜰 때 예외 처리를 해주는 것
		   - try 중괄호{} 안에 있는 실행 내용들이 실행이 되고 있을 때, catch 소괄호() 안에 있는 Exception 종류의 오류가 발생한다면
		     catch 대괄호{}에 있는 실행 내용을 실행하겠다는 것
		   - finally는 쓸 때도 있고 안 쓸 때도 있음
		   - finally에 쓴 실행 내용은 예외 오류가 나지 않더라도 무조건 실행 됨
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		try{
			for (int i = 0; i<=list.size(); i++) {
				System.out.println(list.get(i));
				/*지금 이 for문은 원래 i값이 ArrayList 배열의 크기 미만일 때 까지만 반복 되어야 하는데
				    이하로 설정 되어 있어서 중간에 Exception 오류가 나며 멈추게 된 것 */
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("리스트 크기 초과했습니다.");
			e.printStackTrace(); // 오류 메세지도 같이 출력해주겠다는 메소드
		}finally {
			System.out.println("여기는 무조건 나와요");
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
