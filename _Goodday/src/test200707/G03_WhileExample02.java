package test200707;

public class G03_WhileExample02 {

	public static void main(String[] args) {
		// while 문으로 무한 반복하기
        // i값이 99일 때 반복문 종료하기
		int i = 0;
		i = 1;
		boolean stop = true;
		// boolean 타입 변수와 if문을 이용하여
		// 99가 되면, 조건에 있는 boolean변수를 거짓으로
		// 바꾸어 멈추게 하는 방법

		while (stop) {
			System.out.println(i);
			i++; 
			if (i==99) {
				stop = false;
			}
		}
		System.out.println("반복문 종료");
		/* 1. 실행문{}은 순서대로 실행된다는 것을 생각할 것!!
		 * 2. 첫 변수 값인 1이 먼저 출력 됨
		 * 3. if문 조건을 통과하면 증감식으로 변수값이 2가 됨
		 * 4. while의 조건은 boolean 변수를 통해 true로
		 *    설정했기 때문에 무엇이든 무한 반복이 가능
		 * 5. 다시 2를 출력 하고 if문을 통과하면 증감식으로
		 *    변수 값이 3이 되는 식으로 계속 반복하다가,
		 * 6. 99가 됐을 때 출력을 먼저 한 후에
		 *    if문 조건에 걸려 while문의 조건이 false가 되며
		 *    반복문이 종료됨 */

	
	
	
	}

}
