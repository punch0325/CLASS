package test200703;

public class E01_For {

	public static void main(String[] args) {
		// for 반복문
		/*for (반복 변수 초기 값 ;반복 변수 조건식;증감식) {
                           반복 실행 내용
              } */
		
		//1,2,3을 출력하기
		
		//for문 시작
		int i = 0;
		for (i = 1; i<=10; i++) {
			System.out.println("for문 내부");
			System.out.println(i);
		    System.out.println("\n");
		}//for문 끝
		System.out.println(i);
		/* 증감식에 따라 i 값이 11이 되었지만 조건식에
		 * 맞지 않아 for문은 종료 되고 i값은 11로 남아 있음
		 * 그러므로 for문 밖에 i를 출력 메소드로 찍으면
		 * 11이 출력 되는 것!  */
		
		
		
			

	}

}
