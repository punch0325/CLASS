package test200707;

public class G04_WhileExample03 {

	public static void main(String[] args) {
		//랜덤 주사위 만들기! (6이 되면 종료하기)
		
		int i = 0;
		i = 1;
		boolean stop = true;
		
		while (stop) {
			i = (int)(Math.random()*6)+1;
			System.out.println("숫자: "+i);
			if (i == 6) {
				stop = false;
				System.out.println(i+"이 나왔네요 종료합니다.");
			}
		}
		
//	1. while문의 조건을 bool타입 변수(true값 설정)로 지정
//	2. 실행문에 i값을 랜덤 메소드로 1부터 6까지
//	     무한 반복 되게 발생 시킴
//	3. 출력 메소드를 찍어 랜덤으로 숫자가 출력 됨
//	4. if문으로 i값이 6이 되면 bool타입 변수가 거짓이 되게 함
//  - 만약 랜덤 메소드가 While문 밖에 있으면 랜덤으로 숫자가
//    하나만 출력 되고 끝이 나버림
//  - 랜덤 메소드가 while문 밖에 있는 상태로 while문을 
//	   실행하면 랜덤으로 발생 된 하나의 숫자만 반복이 됨 
	  
 
 
 
 
 
 
	
		
		
		
	}

}
