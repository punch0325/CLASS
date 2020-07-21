package test200706;

public class F05_Example04 {

	public static void main(String[] args) {
//      -별 찍기! , 중첩for문과 if문을 이용
//		*     
//		**
//		***
//		****
//		*****
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
				//j안에서만 출력을 찍었기 때문에 예시 모양의
				//별 찍기가 가능한 것임!
			}System.out.println(); 
		}
		
//			중첩 for문의 조건이 충족 되면 중첩 for문의 
//			"}" 밖으로 빠져나와 출력이 실행 된 후 다시
//		       다시 외부 for문으로 돌아가는 형태 
//          이 예제에서는 내부 for문의 조건이 i보다 작거나
//          같기 때문에 별이 차례대로 찍히는 것!
		
		
		
		
		
		
		

	}

}
