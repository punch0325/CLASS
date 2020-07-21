package test200702;

public class D07_RandomMethod {

	public static void main(String[] args) {
		/* Random 메소드
		   특정 범위 내에서 숫자 하나를 출력해주는 메소드*/
		
		// 1~10 사이의 숫자 하나 발생시키기
		int num = 0;
		num = (int)(Math.random() * 10 ) + 1;
		/*Math라는 클래스가 가지고 있는 random이라는 메소드
		  -random 메소드는 0.0보다는 크거나 같고,
		   1.0보다는 작은 숫자를 발생 시킴*/
		/*(int)는 double 타입 (실수형)을 정수로 변환을
		    시켜준다는 형 변환을 해줌*/
		System.out.println("출력숫자 " + num);
		
		
		
		
	}

}
