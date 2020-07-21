package test200706;

public class F02_Example02 {

	public static void main(String[] args) {
		
		// 1~100 중에 3과 5의 공배수를 출력
		
		for (int i = 1; i<=100 ; i++) {
			if (i % 3 ==0) { //논리 연산자 &&도 사용 가능
				if (i % 5 ==0) {
					System.out.print(" " + i);
				}
			}
		}
		
		

		
		

	}

}
