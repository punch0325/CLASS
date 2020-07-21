package test200706;

public class F04_NestedFor {

	public static void main(String[] args) {
		// 중첩 for문
		
		for (int i = 0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				System.out.print("i 값 : " + i);
				System.out.println("   j 값 : " + j);
			}
		}
		
// 1. 외부 for문이 먼저 실행되므로 i는 0이 찍힘
// 2. i가 0인 상태에서 내부 for문이 실행 되어 j값도 0이 찍힘
// 3. i값은 0인 상태로 내부 for문이 조건을 만족하여 출력 될 때 		
//    까지 j값이 반복 됨
// 4. 그 후엔 다시 외부 for문으로 돌아가 i값은 1이 되고 다시
//    내부 for문이 위와 같이 반복 됨
// 5. 외부 for문이 조건을 만족하여 전부 출력 되면 최종 종료 됨
		
		
		
		
		
		
		
		
		
		
		
	}

}
